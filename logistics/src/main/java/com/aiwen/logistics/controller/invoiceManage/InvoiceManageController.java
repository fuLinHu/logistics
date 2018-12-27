package com.aiwen.logistics.controller.invoiceManage;

import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.InvoiceManageService;
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

/**(杜宗昊)
 * Created by hp on 2018/5/3.
 */
@Controller
@RequestMapping(value = "invoiceManageController")
public class InvoiceManageController {

    @Autowired
    private InvoiceManageService invoiceManageService;

    @RequestMapping(value = "myssc")
    public String  myssc(){
        return "personalCenter/mySsc";
    }

    /*
     * @author 复制 （杜宗昊）
     * @date 2018/5/5 10:12
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "orderCopyInvoice" )
    public ModelAndView orderCopyInvoice(String orderId,HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        InvoiceManage beforeInvoiceList = null;
        if(null != userFront){
            if( null != userFront.getUserId()){
                beforeInvoiceList = invoiceManageService.beforeInvoiceMessage(userFront.getUserId());
            }
        }
        InvoiceManage im = new InvoiceManage();
        ModelAndView modelAndView = new ModelAndView("invoices/invoicesAddPage");
        modelAndView.addObject("invoiceM",beforeInvoiceList);
        modelAndView.addObject("orderId",orderId);
        return modelAndView;
    }

    /*
     * @author 跳转到 新增发票页面（杜宗昊）
     * @date 2018/5/4 14:39
     * @param []
     * @return java.lang.String
     */
    @RequestMapping(value = "invoieInsertPage")
    public ModelAndView invoieInsertPage(String orderId,HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        InvoiceManage beforeInvoiceList = null;
        if(null != userFront){
            if( null != userFront.getUserId()){
                beforeInvoiceList = invoiceManageService.beforeInvoiceMessage(userFront.getUserId());
            }
        }

        ModelAndView modelAndView = new ModelAndView("invoices/invoicesAddPage");
        modelAndView.addObject("beforeInvoice",beforeInvoiceList);
        modelAndView.addObject("orderId",orderId);
        return modelAndView;
    }

    /*
     * @author 发票所对应的订单（杜宗昊）
     * @date 2018/5/4 14:33
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "invoiceDetailedOrder")
    public ModelAndView  invoiceDetailedOrder(Integer invoiceId){
        ModelAndView modelAndView = new ModelAndView("invoices/invoiceInformation");
        List<OrderRelease> orderList = invoiceManageService.invoiceDetailedOrder(invoiceId);
        modelAndView.addObject("orderList",orderList);
        return modelAndView;
    }

    /*
     * @author 申请开发票 (杜宗昊)
     * @date 2018/5/3 19:13
     * @param [request]
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "invoiceApply")
    public ModelAndView  invoiceApply(HttpServletRequest request){
            HttpSession session = request.getSession();
            UserFront userFront = (UserFront) session.getAttribute("userFront");
            ModelAndView modelAndView = new ModelAndView("invoices/invoicesAddSeave");
            List orderMap =null;
            if(null != userFront){
                if( null != userFront.getUserId()){
                    orderMap = invoiceManageService.orderInvoicesApply(userFront.getUserId());
                }
            }
            modelAndView.addObject("orderMap",orderMap);
            return modelAndView;
        }

    /*
     * @author 发票管理（杜宗昊）
     * @date 2018/5/3 10:18
     * @param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "orderListFint" )
    public ModelAndView orderListFint(Integer pageSize,Integer pageNo,String invoiceType,HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        ModelAndView modelAndView = new ModelAndView("invoices/invoicesMain");
        OrderReleaseExample example = new OrderReleaseExample();
        Page page=new Page();
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=10;
        }
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        List<InvoiceManage> invoiceManagesList = null;
        if(null != userFront){
            if( null != userFront.getUserId()){
                invoiceManagesList = invoiceManageService.orderListFint(userFront.getUserId(),invoiceType);
            }else{
                userFront.setUserId(null);
                invoiceManagesList = invoiceManageService.orderListFint(userFront.getUserId(),invoiceType);
            }
        }

        Integer num=invoiceManagesList.size()/pageSize;
        if (invoiceManagesList.size()%pageSize!=0){
            num+=1;
        }
        modelAndView.addObject("pageSize",pageSize);
        modelAndView.addObject("number",num);
        modelAndView.addObject("pageNo",pageNo);
        modelAndView.addObject("toInvoiceType",invoiceType);
        int row=page.getStartRow()+page.getPageSize();
        List list = new ArrayList();
        if (invoiceManagesList.size()>=page.getStartRow()){
            if(invoiceManagesList.size()>=row){
                for(int i=page.getStartRow();i<row;i++){
                    list.add(invoiceManagesList.get(i));
                }
            }else if(invoiceManagesList.size()<row){
                for(int i=page.getStartRow();i<invoiceManagesList.size();i++){
                    list.add(invoiceManagesList.get(i));
                }
            }
        }
        modelAndView.addObject("totalCount",invoiceManagesList.size());
        modelAndView.addObject("invoiceList",list);
        return modelAndView;
    }
    /*
     * @author 跳转发票信息管理页面（杜宗昊）
     * @date 2018/5/3 10:27
     * @param [id]
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "invoiceUserMessageSaveJsp" )
    public ModelAndView invoiceUserMessageSaveJsp(String orderId){
        ModelAndView modelAndView = new ModelAndView("goodquotations/goodquotations");
        modelAndView.addObject("id",orderId);
        return modelAndView;
    }
    /*
     * @author 保存发票信息（杜宗昊）
     * @date 2018/5/3 10:47
     * @param []
     * @return void
     */
    @RequestMapping(value = "saveInvoiceMessage")
    @ResponseBody
    public String saveInvoiceMessage(String orderId,String invoiceType,String invoiceContent,String invoiceTitle,String identifier,
                                   String contactAddress,String telephone ,String bankInformation,String recipient,
                                   String writePhone,String recipientAddress ,HttpServletRequest request){
        HttpSession session = request.getSession();
        InvoiceManage im = new InvoiceManage();
        InvoiceManageExample example  =  new InvoiceManageExample();
        InvoiceManageExample.Criteria criteria = example.createCriteria();
        if(!"".equals(invoiceType) && null != invoiceType && !invoiceType.isEmpty()){
            im.setInvoiceType(invoiceType);
            criteria.andInvoiceTypeEqualTo(invoiceType);
        }
        if(!"".equals(invoiceContent) && null != invoiceContent && !invoiceContent.isEmpty()){
            im.setInvoiceContent(invoiceContent);
            criteria.andInvoiceContentEqualTo(invoiceContent);
        }
        if(!"".equals(invoiceTitle) && null != invoiceTitle && !invoiceTitle.isEmpty()){
            im.setInvoiceTitle(invoiceTitle);
            criteria.andInvoiceTitleEqualTo(invoiceTitle);
        }
        if(!"".equals(identifier) && null != identifier && !identifier.isEmpty()){
            im.setIdentifier(identifier);
            criteria.andIdentifierEqualTo(identifier);
        }
        if(!"".equals(contactAddress) && null != contactAddress && !contactAddress.isEmpty()){
            im.setContactAddress(contactAddress);
            criteria.andContactAddressEqualTo(contactAddress);
        }
        if(!"".equals(telephone) && null != telephone && !telephone.isEmpty()){
            im.setTelephone(telephone);
            criteria.andTelephoneEqualTo(telephone);
        }
        if(!"".equals(bankInformation) && null != bankInformation && !bankInformation.isEmpty()){
            im.setBankInformation(bankInformation);
            criteria.andBankInformationEqualTo(bankInformation);
        }
        if(!"".equals(recipient) && null != recipient && !recipient.isEmpty()){
            im.setRecipient(recipient);
            criteria.andRecipientEqualTo(recipient);
        }
        if(!"".equals(writePhone) && null != writePhone && !writePhone.isEmpty()){
            im.setWritePhone(writePhone);
            criteria.andWritePhoneEqualTo(writePhone);
        }
        if(!"".equals(recipientAddress) && null != recipientAddress && !recipientAddress.isEmpty()){
            im.setRecipientAddress(recipientAddress);
            criteria.andRecipientAddressEqualTo(recipientAddress);
        }
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        if(userFront!=null){
            if( null != userFront.getUserId() ){
                invoiceManageService.saveInvoiceMessage(orderId,im,userFront.getUserId(),example );
            }
        }
        return "";
    }
    /*
     * @author 赋值已有的发票信息 （杜宗昊）
     * @date 2018/5/3 10:59
     * @param []
     * @return com.aiwen.logistics.pojo.OrderRelease
     */
    @RequestMapping(value = "beforeInvoiceMessage")
    @ResponseBody
    public InvoiceManage beforeInvoiceMessage(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        InvoiceManage beforeInvoiceList= null;
        if(null != userFront){
            if(null != userFront.getUserId()){
               beforeInvoiceList = invoiceManageService.beforeInvoiceMessage(userFront.getUserId());
            }
        }

        return beforeInvoiceList;
    }
}
