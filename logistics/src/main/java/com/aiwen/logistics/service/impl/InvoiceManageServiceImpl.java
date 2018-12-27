package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.InvoiceManageMapper;
import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.dao.ReleaseSourceMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.InvoiceManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by hp on 2018/5/3.
 */
@Service
public class InvoiceManageServiceImpl implements InvoiceManageService {

    @Autowired
    private OrderReleaseMapper orderReleaseMapper;

    @Autowired
    private InvoiceManageMapper invoiceManageMapper;

    @Autowired
    private ReleaseSourceMapper releaseSourceMapper;


    /*
    * @author 申请开发票 (杜宗昊)
    * @date 2018/5/3 19:13
    * @param [request]
    * @return org.springframework.web.servlet.ModelAndView
    */
    public List orderInvoicesApply(Integer userId){
        ReleaseSourceExample releaseSourceExample = new ReleaseSourceExample();
        ReleaseSourceExample.Criteria releaseSourceExampleCriteria = releaseSourceExample.createCriteria();
        if(null != userId){
            releaseSourceExampleCriteria.andUserIdEqualTo(userId);
        }
        releaseSourceExampleCriteria.andOrderStateEqualTo(6);
        List<ReleaseSource> releaseSourcesList = releaseSourceMapper.selectByExample(releaseSourceExample);
        OrderReleaseExample example = null;
        List list = new ArrayList();
       for (ReleaseSource   releaseSource: releaseSourcesList) {
           example = new OrderReleaseExample();
           OrderReleaseExample.Criteria criteria = example.createCriteria();
           criteria.andOrderReleaseSourceIdEqualTo(releaseSource.getSourceId());
           criteria.andIsInvoiceEqualTo(0);
           criteria.andOrdersFlagEqualTo(7);
           List<OrderRelease> orderReleaselist = orderReleaseMapper.selectByExample(example);
           for (OrderRelease or: orderReleaselist) {
               if(null != or.getCreateTime() && !"".equals(or.getCreateTime()) && !or.getCreateTime().isEmpty() ){
                   String year = or.getCreateTime().substring(0,4);
                   String month = or.getCreateTime().substring(5,7);
                   String day = or.getCreateTime().substring(8,10);
                   or.setCreateTime(year+"年"+month+"月"+day+"日");
               }else{
                   or.setCreateTime("----");
               }
               or.setReleaseSource(releaseSource);
           }
           list.add(orderReleaselist);

        }
        return list;
    }

    /*
      * @author 发票所对应的订单（杜宗昊）
      * @date 2018/5/4 14:33
      * @param []
      * @return org.springframework.web.servlet.ModelAndView
      */
    public List<OrderRelease> invoiceDetailedOrder(Integer invoiceId){
        OrderReleaseExample orderReleaseExample = new OrderReleaseExample();
        OrderReleaseExample.Criteria orderReleaseExampleCriteria = orderReleaseExample.createCriteria();
        orderReleaseExampleCriteria.andInvoiceIdEqualTo(invoiceId);
        List<OrderRelease> orderReleaselist = orderReleaseMapper.selectByExample(orderReleaseExample);
        for (OrderRelease or: orderReleaselist) {
            String date = this.subDate(or.getCreateTime());
            or.setCreateTime(date);
            ReleaseSource releaseSource = releaseSourceMapper.selectByPrimaryKey(or.getOrderReleaseSourceId());
            or.setReleaseSource(releaseSource);
        }
        return orderReleaselist;
    }

    /*
     * @author 用户订单（杜宗昊）
     * @date 2018/5/3 10:18
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    public  List<InvoiceManage> orderListFint (Integer userId,String invoiceType){
        InvoiceManageExample example = new InvoiceManageExample();
        InvoiceManageExample.Criteria criteria = example.createCriteria();
        if( null != userId){
            criteria.andUserIdEqualTo(userId);
        }
        if(!"".equals(invoiceType) && !"请选择".equals(invoiceType) && null != invoiceType && !invoiceType.isEmpty()){
            criteria.andInvoiceTypeEqualTo(invoiceType);
        }
        OrderReleaseExample orderReleaseExample = null;
        example.setOrderByClause("id");
        List<InvoiceManage> invoiceManagesList = invoiceManageMapper.selectByExample(example);
        for (InvoiceManage invoiceManage:invoiceManagesList) {
            orderReleaseExample = new OrderReleaseExample();
            OrderReleaseExample.Criteria orderCriteria = orderReleaseExample.createCriteria();
            String s = this.subDate(invoiceManage.getCreatedTime());
            invoiceManage.setCreatedTime(s);
            Integer id = invoiceManage.getId();
            System.out.print(id);
            orderCriteria.andInvoiceIdEqualTo(id);
            orderCriteria.andOrdersFlagEqualTo(7);
            List<OrderRelease> orderReleaseList = orderReleaseMapper.selectByExample(orderReleaseExample);
            invoiceManage.setContOrder(orderReleaseList.size());
        }
        return invoiceManagesList;
    }

    /*
  * @author 赋值已有的发票信息 （杜宗昊）
  * @date 2018/5/3 10:59
  * @param []
  * @return com.aiwen.logistics.pojo.OrderRelease
  */
    public InvoiceManage beforeInvoiceMessage(Integer userId){

        InvoiceManage  invoiceManage = invoiceManageMapper.beforeInvoiceMessage(userId);
        return invoiceManage;
    }


    /*
      * @author 保存发票信息（杜宗昊）
      * @date 2018/5/3 10:47
      * @param []
      * @return void
      */
    public void saveInvoiceMessage(String orderId, InvoiceManage im,Integer userId,InvoiceManageExample example ){
        Double money = 0.00 ;
        if(!"".equals(orderId) && null != orderId && !orderId.isEmpty() ){
           String [] order =  orderId.split(",");
           for (int i = 0; i<order.length ;i++ ){
               String id = order[i];
               Integer ids = Integer.parseInt(id.trim());
               OrderRelease orderRelease =orderReleaseMapper.selectByPrimaryKeyID(ids);
               if(null !=orderRelease){
                   money += orderRelease.getOrdersAmount();
               }
           }
        }
        Long aLong = Math.round(money);
        im.setMoney( aLong);
        im.setCreatedTime(this.gainDate());
        im.setUserId(userId);
        im.setInvoiceFlag(1);
        im.setRequisitionNum(this.oddNumbers(userId));
        int count = invoiceManageMapper.insertSelective(im);
        if(count >0 ){
            List<InvoiceManage>  list  = invoiceManageMapper.selectByExample(example);
            for (InvoiceManage invoiceManage :list) {
                OrderRelease or = new OrderRelease();
                Integer id = invoiceManage.getId();
                or.setInvoiceId(id);
                or.setIsInvoice(1);
                if(!"".equals(orderId) && null != orderId && !orderId.isEmpty() ){
                    String [] order =  orderId.split(",");
                    for (int i = 0; i<order.length ;i++ ){
                        String idt = order[i];
                        Integer ids = Integer.parseInt(idt.trim());
                        or.setId(ids);
                        int orderCount = orderReleaseMapper.updateByPrimaryKeySelective(or);
                        if(orderCount == 0){
                           System.out.println("修改订单表关联发票ID失败");
                        }
                    }
                }

            }
        }

    }
    /*
     * @author 截取时间拼接（杜宗昊）
     * @date 2018/5/4 14:48
     * @param [date]
     * @return java.lang.String
     */
    public String subDate(String date){
        if(null != date && !"".equals(date) && !date.isEmpty() ){
            String year = date.substring(0,4);
            String month = date.substring(5,7);
            String day = date.substring(8,10);
            return year+"年"+month+"月"+day+"日";
        }else{
            return "----";
        }
    }

    /*
     * @author 生成申请单号
     * @date 2018/5/4 14:43
     * @param [userId]
     * @return java.lang.String
     */
    public  String oddNumbers(Integer userId) {

        String chars = "abcdefghijklmnopqrstuvwxyz";
        String ch = String.valueOf(chars.charAt((int)(Math.random() * 26)));
        Date date = new Date();
        long time = date.getTime();
        String num = String.valueOf(time);
        System.out.print(num+ch.toUpperCase());
        String id = String.valueOf(userId);
        return num+id+ch.toUpperCase();
    }

    /*
    * @author 获取当前时间 （杜宗昊）
    * @date 2018/4/26 11:48
    * @param [args]
    * @return void
    */
    public String  gainDate () {
        Date day=new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(df.format(day));

        return df.format(day);
    }

}
