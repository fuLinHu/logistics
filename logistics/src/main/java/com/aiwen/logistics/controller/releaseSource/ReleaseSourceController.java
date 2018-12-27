package com.aiwen.logistics.controller.releaseSource;

import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.dao.PluckQuotationMapper;
import com.aiwen.logistics.dao.ReleaseSourceMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.OwnerAddressService;
import com.aiwen.logistics.service.ReleaseSourceService;
import com.aiwen.logistics.service.UserFrontService;
import com.aiwen.logistics.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ASUS on 2018/4/26.
 */
@Controller
@RequestMapping("/releaseSource")
public class ReleaseSourceController {
    @Autowired
    private ReleaseSourceService releaseSourceService;
    @Autowired
    private UserFrontService userFrontService;
    @Autowired
    private OwnerAddressService ownerAddressService;
    @Autowired
    private ReleaseSourceMapper releaseSourceMapper;
    @Autowired
    private OrderReleaseMapper orderReleaseMapper;
    @Autowired
    private PluckQuotationMapper pluckQuotationMapper;
    /**
     *货源中心
     * @return
     */
    @RequestMapping("/releaseSourceList")
    public ModelAndView releaseSourceList(HttpServletRequest request,String company,String startAddress,String arriveAddress,String startTime,String endTime,String startWight,String endWeight,String goods,Integer pageSize,Integer pageNo){
        ModelAndView modelAndView = new ModelAndView("releaseSource/goodsCenter");
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            ReleaseSourceExample releaseSource=new ReleaseSourceExample();
            ReleaseSourceExample.Criteria criteria = releaseSource.createCriteria();
            if(startAddress!=null && startAddress!=""){
//                criteria.andStartAddressEqualTo(startAddress);
                criteria.andStartAddressLike("%"+startAddress+"%");
                modelAndView.addObject("startAddress",startAddress);
            }
            if (arriveAddress!=null && arriveAddress!=""){
//                criteria.andArriveAddressEqualTo(arriveAddress);
                criteria.andArriveAddressLike("%"+arriveAddress+"%");
                modelAndView.addObject("arriveAddress",arriveAddress);
            }
            if(startTime!=null && endTime!=null && startTime!="" && endTime!=""){
                criteria.andEndTimeBetween(startTime,endTime);
                modelAndView.addObject("startTime",startTime);
                modelAndView.addObject("endTime",endTime);
            }
            if(startWight!=null && endWeight!=null && startWight!="" && endWeight!=""){
                criteria.andWeightLike("%/"+company);
//                criteria.andWeightBetween(startWight,endWeight);
                modelAndView.addObject("company",company);
                modelAndView.addObject("startWight",startWight);
                modelAndView.addObject("endWeight",endWeight);
            }
            if(goods!=null && goods!=""){
                criteria.andGoodsEqualTo(goods);
                modelAndView.addObject("goods",goods);
            }
            criteria.andOrderStateEqualTo(4);
            releaseSource.setOrderByClause("source_id");
            Page page=new Page();
            if (pageNo==null){
                pageNo=1;
            }
            if (pageSize==null){
                pageSize=8;
            }
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            List<ReleaseSource> listSource=releaseSourceService.findReleaseSourceList(releaseSource);
            List<ReleaseSource> list=new ArrayList<ReleaseSource>();
            if(startWight!=null && endWeight!=null && startWight!="" && endWeight!=""){
                for (ReleaseSource rs : listSource){
                    Double weight=Double.parseDouble(rs.getWeight().substring(0,rs.getWeight().indexOf("/")));
                    if (weight>=Double.parseDouble(startWight)&&weight<=Double.parseDouble(endWeight)){
                        list.add(rs);
                    }
                }
            }else{
                list=listSource;
            }
            modelAndView.addObject("totalCount",list.size());
            Integer num=list.size()/pageSize;
            if (list.size()%pageSize!=0){
                num+=1;
            }
            modelAndView.addObject("pageSize",pageSize);
            modelAndView.addObject("number",num);
            modelAndView.addObject("pageNo",pageNo);
            List<ReleaseSource> listRelease=new ArrayList<ReleaseSource>();
            int row=page.getStartRow()+page.getPageSize();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            if (list.size()>=page.getStartRow()){
                if(list.size()>=row){
                    for(int i=page.getStartRow();i<row;i++){
                        getReleaseSource(list, listRelease, sdf, i,userFront);
                    }
                }else if(list.size()<row){
                    for(int i=page.getStartRow();i<list.size();i++){
                        getReleaseSource(list, listRelease, sdf, i,userFront);
                    }
                }
            }
            modelAndView.addObject("list",listRelease);
        }catch (Exception e){
            e.printStackTrace();
        }
        return modelAndView;
    }

    private void getReleaseSource(List<ReleaseSource> list, List<ReleaseSource> listRelease, SimpleDateFormat sdf, int i,UserFront userFront) throws ParseException {
        ReleaseSource res=list.get(i);
        res.setWeight(MD5Util.weight(res.getWeight()));
        if(userFront!=null){
            PluckQuotationExample example=new PluckQuotationExample();
            PluckQuotationExample.Criteria criteria1=example.createCriteria();
            criteria1.andCarrierIdEqualTo(userFront.getUserId());
            criteria1.andOrderIdEqualTo(list.get(i).getSourceId());
            List<PluckQuotation> list1=pluckQuotationMapper.selectByExample(example);
            if(list1!=null&&list1.size()>0){
                res.setArriveName("1");
            }
        }
        if(!"".equals(res.getEndDate())&&res.getEndDate()!=null){
            String day=MD5Util.getDatePoor(sdf.parse(res.getEndDate()),new Date());
            res.setEndDate(day);
        }
        if(!"".equals(res.getStartName())&&res.getStartName()!=null){
            res.setStartName(res.getStartName().substring(0,1)+"**");
        }
        if(!"".equals(res.getStartPhone())&&res.getStartPhone()!=null){
            res.setStartPhone(res.getStartPhone().substring(0,3)+"****"+res.getStartPhone().substring(res.getStartPhone().length()-4,res.getStartPhone().length()));
        }
        listRelease.add(res);
    }

    /**
     *订单发布的列表
     * @return
             */
    @RequestMapping("/releaseSource")
    public ModelAndView releaseSource(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("releaseSource/orderRelease");
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            List<ReleaseSource> list=releaseSourceService.findReleaseSourceListByUserId(userFront.getUserId());
            for (int i=0;i<list.size();i++){
                list.get(i).setWeight(MD5Util.weight(list.get(i).getWeight()));
            }
            modelAndView.addObject("list",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  modelAndView;
    }

    /**
     *订单发布的添加页面跳转
     * @return
     */
    @RequestMapping("/addReleaseSource")
    public ModelAndView addReleaseSource(HttpServletRequest request,String id){
        ModelAndView modelAndView = new ModelAndView("releaseSource/orderReleaseAdd");
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            OwnerAddressExample example=new OwnerAddressExample();
            OwnerAddressExample.Criteria criteriaOwner=example.createCriteria();
            criteriaOwner.andUserIdEqualTo(userFront.getUserId());
            List<OwnerAddress> listOwnerAddress=ownerAddressService.findOwnerAddressByExample(example);
            modelAndView.addObject("listOwnerAddress",listOwnerAddress);
            if (id!=null&&id!=""){
                ReleaseSource releaseSource=releaseSourceService.findById(id);
                modelAndView.addObject("releaseSource",releaseSource);
                String weight=releaseSource.getWeight();
                modelAndView.addObject("weight",weight.substring(0,weight.indexOf("/")));
                modelAndView.addObject("company",weight.substring(weight.indexOf("/")+1));
                if (releaseSource.getOrderState()==4||releaseSource.getOrderState()==6){
                    modelAndView.addObject("flg","flg");
                }
            }
            UserFrontExample userFrontExample=new UserFrontExample();
            UserFrontExample.Criteria criteria=userFrontExample.createCriteria();
            criteria.andIdentityTypeEqualTo(2);
            List<UserFront> list=userFrontService.findListByIdentityType(userFrontExample);
            modelAndView.addObject("userFrontList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  modelAndView;
    }

    /**
     *订单发布的添加数据库
     * @return
     */
    @RequestMapping("/insertReleaseSource")
    public ModelAndView insertReleaseSource(HttpServletRequest request,ReleaseSource releaseSource,String company,String bid){
        ModelAndView modelAndView = new ModelAndView("releaseSource/orderRelease");
        int flag =0;
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            if (releaseSource.getStartAddress()!=null&&!"".equals(releaseSource.getStartAddress())){
                OwnerAddressExample example=new OwnerAddressExample();
                OwnerAddressExample.Criteria criteriaOwner=example.createCriteria();
                criteriaOwner.andUserIdEqualTo(userFront.getUserId());
                criteriaOwner.andAddressEqualTo(releaseSource.getStartAddress());
                List<OwnerAddress> listOwnerAddress=ownerAddressService.findOwnerAddressByExample(example);
                if (listOwnerAddress!=null&&listOwnerAddress.size()>0){
                    System.out.println("该出发地地址已存在常用地址表中");
                }else{
                    ownerAddressService.addOwnerAddress(userFront.getUserId(),releaseSource.getStartAddress());
                }
            }
            if (releaseSource.getArriveAddress()!=null&&!"".equals(releaseSource.getArriveAddress())){
                OwnerAddressExample example=new OwnerAddressExample();
                OwnerAddressExample.Criteria criteriaOwner=example.createCriteria();
                criteriaOwner.andUserIdEqualTo(userFront.getUserId());
                criteriaOwner.andAddressEqualTo(releaseSource.getArriveAddress());
                List<OwnerAddress> listOwnerAddress=ownerAddressService.findOwnerAddressByExample(example);
                if (listOwnerAddress!=null&&listOwnerAddress.size()>0){
                    System.out.println("该目的地地址已存在常用地址表中");
                }else{
                    ownerAddressService.addOwnerAddress(userFront.getUserId(),releaseSource.getArriveAddress());
                }
            }
            if (releaseSource.getSourceId()!=null && !"".equals(releaseSource.getSourceId())){
                if ("0".equals(bid)){
                    releaseSource.setBidding(0);
                    if (releaseSource.getTransportType()==1){//陆运
                        releaseSource.setStrSupplier("");
                    }else if(releaseSource.getTransportType()==2){//海运
                        releaseSource.setSupplier("");
                    }
                }
                if ("1".equals(bid)){
                    releaseSource.setSupplier("");
                    releaseSource.setStrSupplier("");
                }
                DecimalFormat df=new DecimalFormat("0.00");
                releaseSource.setWeight(df.format(Double.parseDouble(releaseSource.getWeight()))+"/"+company);
                flag = releaseSourceService.addReleaseSource(releaseSource);
            }else{
                releaseSource.setUserId(userFront.getUserId());//userFront.getUserId()
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                releaseSource.setCreateTime(sdf.format(date));
                releaseSource.setOrderState(1);
                DecimalFormat df=new DecimalFormat("0.00");
                releaseSource.setWeight(df.format(Double.parseDouble(releaseSource.getWeight()))+"/"+company);
                /*if (releaseSource.getTransportType()==2){
                    releaseSource.setSupplier(null);
                }*/
                if ("0".equals(bid)){
                    releaseSource.setBidding(0);
                    if (releaseSource.getTransportType()==1){//陆运
                        releaseSource.setStrSupplier("");
                    }else if(releaseSource.getTransportType()==2){//海运
                        releaseSource.setSupplier("");
                    }
                }
                if ("1".equals(bid)){
                    releaseSource.setSupplier("");
                    releaseSource.setStrSupplier("");
                }
                flag = releaseSourceService.addReleaseSource(releaseSource);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        if (flag==1){
            /*ReleaseSourceExample release=new ReleaseSourceExample();
            ReleaseSourceExample.Criteria criteria = release.createCriteria();*/
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            /*criteria.andUserIdEqualTo(userFront.getUserId());
            List<Integer> status=new ArrayList<Integer>();
            status.add(6);
            criteria.andOrderStateNotIn(status);*/
            List<ReleaseSource> list=releaseSourceService.findReleaseSourceListByUserId(userFront.getUserId());
            modelAndView.addObject("list",list);
            return  modelAndView;
        }else{
            return new ModelAndView("releaseSource/orderReleaseAdd");
        }
    }

    /**
     *删除订单货源信息
     * @return
     */
    @RequestMapping("/deleteReleaseSource")
    @ResponseBody
    public Map<String,Object> deleteReleaseSource(String id){
        Map<String,Object> map=new HashMap<String,Object>();
        String flag="对不起，删除失败！！！";
        try {
            ReleaseSource releaseSource=releaseSourceService.findById(id);
            if(releaseSource.getOrderState()!=4){
                releaseSourceService.deleteById(id);
                flag="恭喜您，删除成功！";
            }else{
                flag="对不起，已生成订单，不允许删除！！！";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("flag",flag);
        return map;
    }

    /**
     *选择供应商
     * @return
     */
    @RequestMapping("/goSelect")
    public ModelAndView goSelect(HttpServletRequest request,String id){
        ModelAndView modelAndView = new ModelAndView("releaseSource/selectSupplier");
        try {
            PluckQuotationExample example=new PluckQuotationExample();
            PluckQuotationExample.Criteria criteria=example.createCriteria();
            criteria.andOrderIdEqualTo(Integer.parseInt(id));
            criteria.andStatusEqualTo(1);
            List<PluckQuotation> list=pluckQuotationMapper.selectByExample(example);
            if(list!=null&&list.size()>0){
                modelAndView.addObject("list",list);
            }else{
                modelAndView.addObject("message","暂无可选供应商！");
            }
            modelAndView.addObject("id",id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  modelAndView;
    }


    /**
     *选择承运商生成订单
     * @return
     */
    @RequestMapping("/releaseSourceOk")
    public String releaseSourceOk(String id,HttpServletRequest request, String pluckId){
        try {
            ReleaseSource releaseSource=releaseSourceService.findById(id);
           PluckQuotation pluckQuotation=pluckQuotationMapper.selectByPrimaryKey(Integer.parseInt(pluckId));
            //添加订单
            OrderRelease orderRelease=new OrderRelease();
            orderRelease.setOrdersFlag(1);//生成订单
            //生成订单编号
            Long time= new Date().getTime();
            HttpSession session=request.getSession();
            UserFront user= (UserFront) session.getAttribute("userFront");
            String num=""+time;
            int length=18-num.length()-(user.getUserId()+"").length();
            for (int i=0;i<length;i++){
                num+=0;
            }
            num+=user.getUserId();
            orderRelease.setOrdersNum(num);
            orderRelease.setIsInvoice(0);
            orderRelease.setWeight(releaseSource.getWeight());
            orderRelease.setOrderReleaseSourceId(releaseSource.getSourceId());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            orderRelease.setCreateTime(sdf.format(new Date()));
            orderRelease.setTransportMode(releaseSource.getTransportType());
            orderRelease.setStartAddress(releaseSource.getStartAddress());
            orderRelease.setArriveAddress(releaseSource.getArriveAddress());
            orderRelease.setOwnerId(releaseSource.getUserId());
            orderRelease.setCarrierId(pluckQuotation.getCarrierId());
            orderRelease.setUnitPrice(pluckQuotation.getAmount());
            orderReleaseMapper.insertSelective(orderRelease);
            releaseSource.setOrderState(7);
            releaseSourceMapper.updateByPrimaryKey(releaseSource);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:releaseSource";
    }

    /**
     *跳转报价页面
     * @return
     */
    @RequestMapping("/goPluck")
    public ModelAndView goPluck(HttpServletRequest request,String id){
        ModelAndView modelAndView = new ModelAndView("releaseSource/pluck");
        ReleaseSource releaseSource=releaseSourceMapper.selectByPrimaryKey(Integer.parseInt(id));
        releaseSource.setWeight(MD5Util.weight(releaseSource.getWeight()));
        modelAndView.addObject("releaseSource",releaseSource);
        return  modelAndView;
    }

    //保存报价
    @RequestMapping("/savePluck")
    public String savePluck(PluckQuotation pluckQuotation,String weig){
        if("吨".equals(weig.substring(weig.length()-1,weig.length()))){
            pluckQuotation.setWeight(Double.parseDouble(weig.substring(0,weig.indexOf("吨"))));
        }else{
            pluckQuotation.setWeight(Double.parseDouble(weig.substring(0,weig.indexOf("*"))));
        };
        pluckQuotationMapper.insert(pluckQuotation);
        return "redirect:releaseSourceList";
    }

}
