package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.*;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by ASUS on 2018/4/28.
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private PersonalInfoMapper personalInfoMapper;
    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;
    @Autowired
    private UserAssetsMapper userAssetsMapper;
    @Autowired
    private OrderReleaseMapper orderReleaseMapper;
   /* @Autowired
    private UserFrontMapper userFrontMapper;*/

    @Override
    public StatisticsVo statistics(HttpServletRequest request) {
        StatisticsVo statisticsVo=new StatisticsVo();
        UserFront userFront= (UserFront) request.getSession().getAttribute("userFront");
//        UserFront userFront=userFrontMapper.selectByPrimaryKey(2);
        statisticsVo.setUserName(userFront.getUserName());
        statisticsVo.setIdentityType(userFront.getIdentityType());
        statisticsVo.setLoginTime(userFront.getLoginTime());
        if(1==userFront.getIdentityType()){
            List<PersonalInfo> personalInfo=personalInfoMapper.selectByUserId(userFront.getUserId());
            if(personalInfo!=null && personalInfo.size()>0){
                PersonalInfo personal=personalInfo.get(0);
                statisticsVo.setTelePhone(personal.getTel());
                statisticsVo.setRegion(personal.getAddress());
            }
        }else if(2==userFront.getIdentityType()){
            List<EnterpriseInfo> enterpriseInfo= enterpriseInfoMapper.selectByUserId(userFront.getUserId());
            if(enterpriseInfo!=null && enterpriseInfo.size()>0){
                EnterpriseInfo enterprise=enterpriseInfo.get(0);
                statisticsVo.setTelePhone(enterprise.getEnterpriseTel());
                statisticsVo.setRegion(enterprise.getRegisteredAddress());
            }
        }
        if ("1".equals(userFront.getAccountType())){
            OrderReleaseExample example=new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
            criteria.andOwnerIdEqualTo(userFront.getUserId());
            criteria.andOrdersFlagEqualTo(7);
            List<OrderRelease> list=orderReleaseMapper.selectByExample(example);
            //累计已结算金额
            Double sumAmount=0.00;
            //累计成交货量
            Double weight=0.00;
            if (list!=null && list.size()>0){
                for (OrderRelease ore : list){
                    sumAmount+=ore.getOrdersAmount();
                    String wg = ore.getWeight();
                    String weig=wg.substring(0,wg.indexOf("/"));
                    weight+=Double.parseDouble(weig);
                }
            }
            //充值
            List<UserAssets> userAssets=userAssetsMapper.selectByUserId(userFront.getUserId(),1);
            //提现
            List<UserAssets> userAssetss=userAssetsMapper.selectByUserId(userFront.getUserId(),2);
            if(userAssets!=null && userAssets.size()>0){
                Double amount=0.00;
                if(userAssetss!=null && userAssetss.size()>0){
                    amount=userAssets.get(0).getAllAssets()-userAssetss.get(0).getAllAssets()-sumAmount;
                    statisticsVo.setAccountBalance(amount.toString());
                }else{
                    amount=userAssets.get(0).getAllAssets()-sumAmount;
                    statisticsVo.setAccountBalance(amount.toString());
                }
            }
            statisticsVo.setTradeNoteNum(list.size()+"");
            statisticsVo.setVolumeGoods(weight+"");
            statisticsVo.setSettledWaybill(list.size()+"");
            statisticsVo.setSettledAmount(sumAmount+"");
        }else if("2".equals(userFront.getAccountType())){
            OrderReleaseExample example=new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
            criteria.andCarrierIdEqualTo(userFront.getUserId());
            criteria.andOrdersFlagEqualTo(7);
            List<OrderRelease> list=orderReleaseMapper.selectByExample(example);
            //累计已结算金额
            Double sumAmount=0.00;
            //累计成交货量
            Double weight=0.00;
            if (list!=null && list.size()>0){
                for (OrderRelease ore : list){
                    sumAmount+=ore.getOrdersAmount();
                    String wg = ore.getWeight();
                    String weig=wg.substring(0,wg.indexOf("/"));
                    weight+=Double.parseDouble(weig);
                }
            }
            statisticsVo.setAccountBalance("null");
            statisticsVo.setTradeNoteNum(list.size()+"");
            statisticsVo.setVolumeGoods(weight+"");
            statisticsVo.setSettledWaybill(list.size()+"");
            statisticsVo.setSettledAmount(sumAmount+"");
        }
        return statisticsVo;
    }
}
