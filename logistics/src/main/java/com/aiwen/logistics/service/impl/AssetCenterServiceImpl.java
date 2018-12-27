package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.dao.UserAssetsMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.AssetCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by ASUS on 2018/5/5.
 */
@Service
public class AssetCenterServiceImpl implements AssetCenterService {

    @Autowired
    private UserAssetsMapper userAssetsMapper;
    @Autowired
    private OrderReleaseMapper orderReleaseMapper;

    @Override
    public AssetVo findAssetByUserFront(UserFront userFront) {
        AssetVo assetVo = new AssetVo();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
            String first = format.format(c.getTime());
            c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
            String last = format.format(c.getTime());
            if("1".equals(userFront.getAccountType())){
                OrderReleaseExample example=new OrderReleaseExample();
                OrderReleaseExample.Criteria criteria = example.createCriteria();
                criteria.andOwnerIdEqualTo(userFront.getUserId());
                criteria.andOrdersFlagEqualTo(7);
                List<OrderRelease> list=orderReleaseMapper.selectByExample(example);
                //累计已结算金额
                Double sumAmount=0.00;
                if (list!=null && list.size()>0){
                    for (OrderRelease ore : list){
                        sumAmount+=ore.getOrdersAmount();
                    }
                }
                //充值
                List<UserAssets> userAssets=userAssetsMapper.selectByUserId(userFront.getUserId(),1);
                //提现
                List<UserAssets> userAssetss=userAssetsMapper.selectByUserId(userFront.getUserId(),2);
                if(userAssets!=null && userAssets.size()>0){
                    //账户余额
                    Double amount=0.00;
                    if(userAssetss!=null && userAssetss.size()>0){
                        amount=userAssets.get(0).getAllAssets()-userAssetss.get(0).getAllAssets()-sumAmount;
                        assetVo.setAccountBalance(amount+"");
                        assetVo.setAvailableAmount(amount+"");
                    }else{
                        amount=userAssets.get(0).getAllAssets()-sumAmount;
                        assetVo.setAccountBalance(amount+"");
                        assetVo.setAvailableAmount(amount+"");
                    }
                }
                OrderReleaseExample example1=new OrderReleaseExample();
                OrderReleaseExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andOwnerIdEqualTo(userFront.getUserId());
                criteria1.andOrdersFlagEqualTo(7);
                criteria1.andCompleteTimeBetween(first,last);
                List<OrderRelease> list1=orderReleaseMapper.selectByExample(example1);
                //本月消费
                Double sumAmount1=0.00;
                //本月海运消费
                Double amount=0.00;
                if (list1!=null && list1.size()>0){
                    for (OrderRelease ore : list1){
                        sumAmount1+=ore.getOrdersAmount();
                        if (ore.getTransportMode()==2){
                            amount+=ore.getOrdersAmount();
                        }
                    }
                }
                assetVo.setConsumption(sumAmount1+"");
                assetVo.setSeaborneConsumption(amount+"");
                assetVo.setRoadConsumption((sumAmount1-amount)+"");
                UserAssetsExample userAssetsExample = new UserAssetsExample();
                UserAssetsExample.Criteria criteria2=userAssetsExample.createCriteria();
                criteria2.andUserIdEqualTo(userFront.getUserId());
                criteria2.andRechargeTimeBetween(first,last);
                List<UserAssets> userAssetsList=userAssetsMapper.selectByExample(userAssetsExample);
                Double rechargeAmount=0.00;
                for (UserAssets assets : userAssetsList){
                    rechargeAmount+=assets.getRechargeAmount();
                }
                assetVo.setRechargeAmount(rechargeAmount+"");
                assetVo.setFlag("1");
            }
            if ("2".equals(userFront.getAccountType())){
                OrderReleaseExample example=new OrderReleaseExample();
                OrderReleaseExample.Criteria criteria = example.createCriteria();
                criteria.andCarrierIdEqualTo(userFront.getUserId());
                criteria.andOrdersFlagEqualTo(7);
                criteria.andCompleteTimeBetween(first,last);
                List<OrderRelease> list=orderReleaseMapper.selectByExample(example);
                Double amount=0.00;
                for (OrderRelease ore : list){
                    amount+=ore.getOrdersAmount();
                }
                assetVo.setMonthlyIncome(amount+"");
                OrderReleaseExample example1=new OrderReleaseExample();
                OrderReleaseExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andCarrierIdEqualTo(userFront.getUserId());
                criteria1.andOrdersFlagEqualTo(7);
                criteria1.andCompleteTimeBetween(first,last);
                List<OrderRelease> list1=orderReleaseMapper.selectByExample(example1);
                Double sumAmount=0.00;
                for (OrderRelease ore :list1){
                    sumAmount+=ore.getOrdersAmount();
                }
                assetVo.setTotalIncome(sumAmount+"");
                assetVo.setFlag("2");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return assetVo;
    }

    @Override
    public List<OrderRelease> findOrderRelease(UserFront userFront, String start, String end, String type) {
        List<OrderRelease> list=null;
        try {
            OrderReleaseExample example=new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
            criteria.andOwnerIdEqualTo(userFront.getUserId());
            criteria.andOrdersFlagEqualTo(7);
            if (!"".equals(type)&&type!=null){
                criteria.andTransportModeEqualTo(Integer.parseInt(type));
            }
            if(!"".equals(start)&&!"".equals(end)&&start!=null&&end!=null){
                criteria.andCompleteTimeBetween(start,end);
            }
            list=orderReleaseMapper.selectByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void saveAssets(int id, String amount,String rechargeType,String rechargeCode ,Integer flag) {
        try {
            UserAssetsExample example=new UserAssetsExample();
            UserAssetsExample.Criteria criteria=example.createCriteria();
            criteria.andUserIdEqualTo(id);
            example.setOrderByClause("assets_id");
            UserAssets userAssets=new UserAssets();
            userAssets.setUserId(id);
            Double amountNum=0.00;
            criteria.andFlagEqualTo(flag);
            List<UserAssets> list=userAssetsMapper.selectByExample(example);
            if (list!=null&&list.size()>0){
                amountNum=list.get(0).getAllAssets();
            }
            amountNum+=Double.parseDouble(amount);
            userAssets.setAllAssets(amountNum);
            userAssets.setRechargeAmount(Double.parseDouble(amount));
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(new Date());
            userAssets.setRechargeTime(date);
            userAssets.setFlag(flag);
            userAssets.setRechargeCode(rechargeCode);
            userAssets.setRechargeType(rechargeType);
            userAssetsMapper.insert(userAssets);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public List<UserAssets> findUserAssetsBy(Integer userId, Integer flag,String type,String start, String end){
        //充值信息
        UserAssetsExample example = new UserAssetsExample();
        UserAssetsExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andFlagEqualTo(flag);
        example.setOrderByClause("assets_id");
        if(type!=null&&!"".equals(type)){
            if(!"".equals(start)&&!"".equals(end)&&start!=null&&end!=null){
                criteria.andRechargeTimeBetween(start,end);
            }
        }
        List<UserAssets> userAssets = userAssetsMapper.selectByExample(example);
        return userAssets;
    }
}
