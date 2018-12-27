package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.InvoiceManage;
import com.aiwen.logistics.pojo.InvoiceManageExample;
import com.aiwen.logistics.pojo.OrderRelease;
import com.aiwen.logistics.pojo.OrderReleaseExample;

import java.util.List;
import java.util.Map;

/**
 * Created by hp on 2018/5/3.
 */
public interface InvoiceManageService {

  /*
      * @author 发票所对应的订单（杜宗昊）
      * @date 2018/5/4 14:33
      * @param []
      * @return org.springframework.web.servlet.ModelAndView
      */
  public List<OrderRelease> invoiceDetailedOrder(Integer invoiceId);
  /*
    * @author 申请开发票 (杜宗昊)
    * @date 2018/5/3 19:13
    * @param [request]
    * @return org.springframework.web.servlet.ModelAndView
    */
   public List orderInvoicesApply(Integer userId);

  /*
     * @author 用户订单（杜宗昊）
     * @date 2018/5/3 10:18
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    public  List<InvoiceManage> orderListFint( Integer userId,String invoiceType);



    /*
   * @author 赋值已有的发票信息 （杜宗昊）
   * @date 2018/5/3 10:59
   * @param []
   * @return com.aiwen.logistics.pojo.OrderRelease
   */
    public InvoiceManage beforeInvoiceMessage(Integer userId);

    /*
       * @author 保存发票信息（杜宗昊）
       * @date 2018/5/3 10:47
       * @param []
       * @return void
       */
    public void saveInvoiceMessage(String orderId, InvoiceManage im,Integer userId,InvoiceManageExample example );
}