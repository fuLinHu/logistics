package com.aiwen.logistics.controller.assetcenter;

import com.aiwen.logistics.dao.UserAssetsMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.AssetCenterService;
import com.aiwen.logistics.service.UserMessagePerfectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/5/4.
 */
@Controller
@RequestMapping("/assetCenter")
public class AssetCenterController {

    @Autowired
    private AssetCenterService assetCenterService;
    @Autowired
    private UserAssetsMapper userAssetsMapper;

    @Autowired
    private UserMessagePerfectService ums;

    @RequestMapping("toOrder")
    public String toOrder(){
        //跳转到支付页面
        return "/assetCenter/assetCenter3";
    }
    @RequestMapping("judgePayAccount")
    @ResponseBody
    public Object judgePayAccount(HttpServletRequest request){
        HttpSession session=request.getSession();
        UserFront userFront= (UserFront) session.getAttribute("userFront");
        Map<String, String> stringStringMap = ums.judgePayAccount(userFront);
        String alipayAccount = stringStringMap.get("alipayAccount");
        String alipayAccountRealName = stringStringMap.get("alipayAccountRealName");
        boolean flag=false;
        if((alipayAccount==null||"".equals(alipayAccount))||(alipayAccountRealName==null||"".equals(alipayAccountRealName))){
            flag=true;
        }
        return flag;
    }
    /**
     * 资产中心跳转页面
     */
    @RequestMapping("assetCenter")
    public ModelAndView assetCenter(HttpServletRequest request,String startTime,String endTime,String type,Integer pageSize,Integer pageNo){
        ModelAndView mv=null;
        try {
            HttpSession session=request.getSession();
            String flag = request.getParameter("flag");//0 失败  1 成功
            String typeFlag = request.getParameter("typeFlag");//typeFlag 支付  withdraw 提现
            //
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            //充值信息
            List<UserAssets> list1=assetCenterService.findUserAssetsBy(userFront.getUserId(),1,typeFlag,startTime,endTime);
            //提现信息
            List<UserAssets> list2=assetCenterService.findUserAssetsBy(userFront.getUserId(),2,typeFlag,startTime,endTime);
            AssetVo assetVo= assetCenterService.findAssetByUserFront(userFront);
            if ("1".equals(assetVo.getFlag())){
                mv=new ModelAndView("/assetCenter/assetCenter1");
                if (!"".equals(startTime)&&startTime!=null){
                    mv.addObject("startTime",startTime);
                }
                if (!"".equals(endTime)&&endTime!=null){
                    mv.addObject("endTime",endTime);
                }
                if (!"".equals(type)&&type!=null){
                    mv.addObject("type",type);
                }
                List<OrderRelease> list=assetCenterService.findOrderRelease(userFront,startTime,endTime,type);
                Page page=new Page();
                if (pageNo==null){
                    pageNo=1;
                }
                if (pageSize==null){
                    pageSize=5;
                }
                page.setPageNo(pageNo);
                page.setPageSize(pageSize);
                mv.addObject("totalCount",list.size());
                Integer num=list.size()/pageSize;
                if (list.size()%pageSize!=0){
                    num+=1;
                }
                mv.addObject("pageSize",pageSize);
                mv.addObject("number",num);
                mv.addObject("pageNo",pageNo);
                List<OrderRelease> listOrder=new ArrayList<OrderRelease>();
                int row=page.getStartRow()+page.getPageSize();
                if (list.size()>=page.getStartRow()){
                    if(list.size()>=row){
                        for(int i=page.getStartRow();i<row;i++){
                            listOrder.add(list.get(i));
                        }
                    }else if(list.size()<row){
                        for(int i=page.getStartRow();i<list.size();i++){
                            listOrder.add(list.get(i));
                        }
                    }
                }
                mv.addObject("list",listOrder);
                if("1".equals(flag)){//充值成功的页面
                    mv.addObject("flag",flag);
                }else if("0".equals(flag)){//充值失败的页面
                    mv.addObject("flag",flag);
                }
                mv.addObject("page",page);
            }
            if ("2".equals(assetVo.getFlag())){
                mv=new ModelAndView("/assetCenter/assetCenter2");
                if("1".equals(flag)){//充值成功的页面
                    mv.addObject("flag",flag);
                }else if("0".equals(flag)){//充值失败的页面
                    mv.addObject("flag",flag);
                }
                if (!"".equals(startTime)&&startTime!=null){
                    mv.addObject("startTime",startTime);
                }
                if (!"".equals(endTime)&&endTime!=null){
                    mv.addObject("endTime",endTime);
                }
                if (!"".equals(type)&&type!=null){
                    mv.addObject("type",type);
                }
            }
            mv.addObject("typeFlag",typeFlag);
            mv.addObject("balance",assetVo.getAccountBalance());
            mv.addObject("assetVo",assetVo);
            mv.addObject("list1",list1);
            mv.addObject("list2",list2);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mv;
    }
}
