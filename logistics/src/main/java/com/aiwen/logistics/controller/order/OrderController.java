package com.aiwen.logistics.controller.order;

import com.aiwen.logistics.dao.*;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.*;
import com.aiwen.logistics.util.MD5Util;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: 付林虎
 * @Date: 2018/4/27 17:05
 * 暂时测试用
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private UserFrontService userFrontService;
    @Autowired
    private ITransportationService transportationService;
    @Autowired
    private ICarInformationService carInformationService;
    @Autowired
    private ISyscodeService syscodeService;
    @Autowired
    private PersonalInfoMapper personalInfoMapper;
    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;
    @Autowired
    private LandTransportationMapper landTransportationMapper;
    @Autowired
    private OrderReleaseMapper orderReleaseMapper;
    @Autowired
    private UserFrontMapper userFrontMapper;
    @Autowired
    private CarInformationMapper carInformationMapper;
    @Autowired
    private SyscodeMapper syscodeMapper;
    @Autowired
    private EvaluationMapper evaluationMapper;
    @Autowired
    private ComplainMapper complainMapper;

    @RequestMapping("/toOrderManagement")
    public ModelAndView toOrderManagement(Integer pageSize, Integer pageNo, String invoiceType, OrderRelease orderRelease, HttpServletRequest request) {
        HttpSession session = request.getSession();
        ModelAndView modelAndView = null;
        Page page = new Page();
        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        if (userFront != null && !"".equals(userFront)) {
            modelAndView = new ModelAndView("order/orderManagement");
            if ("1".equals(userFront.getAccountType())) {
                orderRelease.setOwnerId(userFront.getUserId());
            }
            if ("2".equals(userFront.getAccountType())) {
                orderRelease.setCarrierId(userFront.getUserId());
            }
            List<OrderRelease> orderList1 = iOrderService.getOrderList(orderRelease);
            List<OrderRelease> orderList = new ArrayList<OrderRelease>();
         /*<option value="0">全部订单</option>
        <option value="1">近一个月</option>
        <option value="3">近三个月</option>
        <option value="6">近半年</option>
        <option value="12">近一年</option>
        <option value="36">近三年</option>*/
            String createTime = orderRelease.getCreateTime();
            if (createTime != null && !"0".equals(createTime) && createTime != "") {
                Calendar calendar = Calendar.getInstance();
                if ("1".equals(createTime)) {
                    calendar.add(Calendar.MONTH, -1);// 月份减1
                } else if ("3".equals(createTime)) {
                    calendar.add(Calendar.MONTH, -3);// 月份减3
                } else if ("6".equals(createTime)) {
                    calendar.add(Calendar.MONTH, -6);// 月份减6
                } else if ("12".equals(createTime)) {
                    calendar.add(Calendar.MONTH, -12);// 月份减12
                } else if ("36".equals(createTime)) {
                    calendar.add(Calendar.MONTH, -36);// 月份减36
                }
                Date time = calendar.getTime();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    if (orderList1 != null && orderList1.size() > 0) {
                        for (OrderRelease item : orderList1) {
                            Date parse = simpleDateFormat.parse(item.getCreateTime());
                            if (parse.after(time)) {
                                orderList.add(item);
                            }
                        }
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                orderList = orderList1;
            }
            Integer num = orderList.size() / pageSize;
            if (orderList.size() % pageSize != 0) {
                num += 1;
            }
            modelAndView.addObject("pageSize", pageSize);
            modelAndView.addObject("number", num);
            modelAndView.addObject("pageNo", pageNo);
            modelAndView.addObject("toInvoiceType", invoiceType);
            int row = page.getStartRow() + page.getPageSize();
            List list = new ArrayList();
            if (orderList.size() >= page.getStartRow()) {
                if (orderList.size() >= row) {
                    for (int i = page.getStartRow(); i < row; i++) {
                       /* String or=orderList.get(i).getWeight().substring(orderList.get(i).getWeight().indexOf("/")+1);
                        if ("吨".equals(or)||"方".equals(or)){
                            orderList.get(i).setWeight(orderList.get(i).getWeight().replace("/",""));
                        }else{
                            String weg=orderList.get(i).getWeight().substring(0,orderList.get(i).getWeight().indexOf("/"));
                            orderList.get(i).setWeight(new DecimalFormat("00").format(Double.parseDouble(weg))+"*"+orderList.get(i).getWeight().substring(orderList.get(i).getWeight().indexOf("/")+1));
                        }*/
                        orderList.get(i).setWeight(MD5Util.weight(orderList.get(i).getWeight()));
                        OrderRelease order = orderList.get(i);
                        EvaluationExample  evaluationExample = new EvaluationExample();
                        EvaluationExample.Criteria criteria=evaluationExample.createCriteria();
                        criteria.andOrderIdEqualTo(order.getId());
                        List<Evaluation> evaluationList = evaluationMapper.selectByExample(evaluationExample);
                        if(evaluationList != null && evaluationList.size()>0){
                            order.setTransactionTime("1");
                        }
                        list.add(order);
                    }
                } else if (orderList.size() < row) {
                    for (int i = page.getStartRow(); i < orderList.size(); i++) {
                        orderList.get(i).setWeight(MD5Util.weight(orderList.get(i).getWeight()));
                        OrderRelease order = orderList.get(i);
                        list.add(order);
                    }
                }
            }
            modelAndView.addObject("invoiceList", list);
            modelAndView.addObject("orderRelease", orderRelease);
            modelAndView.addObject("totalCount", orderList.size());

        } else {
            modelAndView = new ModelAndView("Login/login");
        }

        return modelAndView;
    }

    //订单统计
    @RequestMapping("/toOrderStatistic")
    public ModelAndView toOrderStatistic(Integer pageSize, Integer pageNo, HttpServletRequest request, String orderNum, String orderType, String type) {
        ModelAndView mv = new ModelAndView("order/orderStatistic");
        try {
            Page page = new Page();
            if (pageNo == null) {
                pageNo = 1;
            }
            if (pageSize == null) {
                pageSize = 10;
            }
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            HttpSession session = request.getSession();
            UserFront userFront = (UserFront) session.getAttribute("userFront");
            OrderReleaseExample example = new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
            if (!"".equals(orderNum) && orderNum != null) {
                criteria.andOrdersNumLike("%" + orderNum + "%");
                mv.addObject("orderNum", orderNum);
            }
            if (!"".equals(orderType) && orderType != null) {
                criteria.andOrdersFlagEqualTo(Integer.parseInt(orderType));
                mv.addObject("orderType", orderType);
            }
            if (!"".equals(type) && type != null) {
                criteria.andTransportModeEqualTo(Integer.parseInt(type));
                mv.addObject("type", type);
            }
            if ("1".equals(userFront.getAccountType())) {//货主
                criteria.andOwnerIdEqualTo(userFront.getUserId());
            }
            if ("2".equals(userFront.getAccountType())) {//承运方
                criteria.andCarrierIdEqualTo(userFront.getUserId());
            }
            example.setOrderByClause("id");
            List<OrderRelease> orderList = orderReleaseMapper.selectByExample(example);
            Integer num = orderList.size() / pageSize;
            if (orderList.size() % pageSize != 0) {
                num += 1;
            }
            mv.addObject("pageSize", pageSize);
            mv.addObject("number", num);
            mv.addObject("pageNo", pageNo);
            mv.addObject("totalCount", orderList.size());
            List<OrderRelease> list = getList(orderList, page);
            mv.addObject("orderList", list);
            Integer count1 = 0;//未匹配数量
            Integer count2 = 0;//运输中数量
            Integer count3 = 0;//未支付数量
            Integer count4 = 0;//未开票数量
            Integer count5 = 0;//已开票数量
            Double amount1 = 0.00;//未支付的结算金额
            Double amount2 = 0.00;//未开票的结算金额
            Double amount3 = 0.00;//已开票的结算金额
            for (OrderRelease orderRelease : orderList) {
                if (1 == orderRelease.getOrdersFlag()) {
                    count1 += 1;
                }
                if (202 == orderRelease.getOrdersFlag()) {
                    count2 += 1;
                }
                if (3 == orderRelease.getOrdersFlag() || 4 == orderRelease.getOrdersFlag() || 5 == orderRelease.getOrdersFlag() || 6 == orderRelease.getOrdersFlag()) {
                    count3 += 1;
                    if (orderRelease.getOrdersAmount() != null && !"".equals(orderRelease.getOrdersAmount())) {
                        amount1 += orderRelease.getOrdersAmount();
                    }
                }
                if (0 == orderRelease.getIsInvoice() || 1 == orderRelease.getIsInvoice()) {
                    count4 += 1;
                    if (orderRelease.getOrdersAmount() != null && !"".equals(orderRelease.getOrdersAmount())) {
                        amount2 += orderRelease.getOrdersAmount();
                    }
                }
                if (2 == orderRelease.getIsInvoice()) {
                    count5 += 1;
                    if (orderRelease.getOrdersAmount() != null && !"".equals(orderRelease.getOrdersAmount())) {
                        amount3 += orderRelease.getOrdersAmount();
                    }
                }
            }
            mv.addObject("count1", count1);
            mv.addObject("count2", count2);
            mv.addObject("count3", count3);
            mv.addObject("count4", count4);
            mv.addObject("count5", count5);
            mv.addObject("amount1", amount1);
            mv.addObject("amount2", amount2);
            mv.addObject("amount3", amount3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }


    //订单流水
    @RequestMapping("/toOrderFlow")
    public ModelAndView toOrderFlow(Integer pageSize, Integer pageNo, HttpServletRequest request, String orderNum, String orderType, String type) {
        ModelAndView mv = new ModelAndView("order/orderFlow");
        try {
            Page page = new Page();
            if (pageNo == null) {
                pageNo = 1;
            }
            if (pageSize == null) {
                pageSize = 10;
            }
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            HttpSession session = request.getSession();
            UserFront userFront = (UserFront) session.getAttribute("userFront");
            OrderReleaseExample example = new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
            if (!"".equals(orderNum) && orderNum != null) {
                criteria.andOrdersNumLike("%" + orderNum + "%");
                mv.addObject("orderNum", orderNum);
            }
            if (!"".equals(orderType) && orderType != null) {
                criteria.andOrdersFlagEqualTo(Integer.parseInt(orderType));
                mv.addObject("orderType", orderType);
            }
            if (!"".equals(type) && type != null) {
                criteria.andTransportModeEqualTo(Integer.parseInt(type));
                mv.addObject("type", type);
            }
            if ("1".equals(userFront.getAccountType())) {//货主
                criteria.andOwnerIdEqualTo(userFront.getUserId());
            }
            if ("2".equals(userFront.getAccountType())) {//承运方
                criteria.andCarrierIdEqualTo(userFront.getUserId());
            }
            example.setOrderByClause("id");
            List<OrderRelease> orderList = orderReleaseMapper.selectByExample(example);
            Integer num = orderList.size() / pageSize;
            if (orderList.size() % pageSize != 0) {
                num += 1;
            }
            mv.addObject("pageSize", pageSize);
            mv.addObject("number", num);
            mv.addObject("pageNo", pageNo);
            mv.addObject("totalCount", orderList.size());
            List<OrderRelease> list = getList(orderList, page);
            mv.addObject("orderList", list);
            Integer count3 = 0;//未支付数量
            Integer count4 = 0;//未开票数量
            Integer count5 = 0;//已开票数量
            Double amount1 = 0.00;//未支付的结算金额
            Double amount2 = 0.00;//未开票的结算金额
            Double amount3 = 0.00;//已开票的结算金额
            for (OrderRelease orderRelease : orderList) {
                if (3 == orderRelease.getOrdersFlag() || 4 == orderRelease.getOrdersFlag() || 5 == orderRelease.getOrdersFlag() || 6 == orderRelease.getOrdersFlag()) {
                    count3 += 1;
                    if (orderRelease.getOrdersAmount() != null && !"".equals(orderRelease.getOrdersAmount())) {
                        amount1 += orderRelease.getOrdersAmount();
                    }
                }
                if (0 == orderRelease.getIsInvoice() || 1 == orderRelease.getIsInvoice()) {
                    count4 += 1;
                    if (orderRelease.getOrdersAmount() != null && !"".equals(orderRelease.getOrdersAmount())) {
                        amount2 += orderRelease.getOrdersAmount();
                    }
                }
                if (2 == orderRelease.getIsInvoice()) {
                    count5 += 1;
                    if (orderRelease.getOrdersAmount() != null && !"".equals(orderRelease.getOrdersAmount())) {
                        amount3 += orderRelease.getOrdersAmount();
                    }
                }
            }
            mv.addObject("count3", count3);
            mv.addObject("count4", count4);
            mv.addObject("count5", count5);
            mv.addObject("amount1", amount1);
            mv.addObject("amount2", amount2);
            mv.addObject("amount3", amount3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }


    //对账结算
    @RequestMapping("/toOrderAccount")
    public ModelAndView toOrderAccount(HttpServletRequest request,String year, String month) {
        ModelAndView mv = new ModelAndView("order/orderAccount");
        try {
            HttpSession session = request.getSession();
            UserFront userFront = (UserFront) session.getAttribute("userFront");
            OrderReleaseExample example = new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
           /* if (!"".equals(orderNum) && orderNum != null) {
                criteria.andOrdersNumLike("%" + orderNum + "%");
                mv.addObject("orderNum", orderNum);
            }*/
            Calendar cale = null;
            cale = Calendar.getInstance();
            String time="";
            if (!"".equals(year) && year != null) {
                time+=year;
                mv.addObject("year",year);
            }else{
                time+=cale.get(Calendar.YEAR);
                mv.addObject("year",cale.get(Calendar.YEAR));
            }
            time+="-";
            if (!"".equals(month) && month != null) {
                time+=month;
                mv.addObject("month",month);
            }else{
                if(cale.get(Calendar.MONTH) + 1<10){
                    time+="0";
                    time+=cale.get(Calendar.MONTH) + 1;
                    mv.addObject("month","0"+(cale.get(Calendar.MONTH) + 1));
                }else{
                    time+=cale.get(Calendar.MONTH) + 1;
                    mv.addObject("month",cale.get(Calendar.MONTH) + 1);
                }
            }
            criteria.andCompleteTimeLike("%"+time+"%");
            if ("1".equals(userFront.getAccountType())) {//货主
                criteria.andOwnerIdEqualTo(userFront.getUserId());
            }
            if ("2".equals(userFront.getAccountType())) {//承运方
                criteria.andCarrierIdEqualTo(userFront.getUserId());
            }
            criteria.andTransportModeEqualTo(1);
            criteria.andOrdersFlagEqualTo(7);
            example.setOrderByClause("id");
            List<OrderRelease> orderList = orderReleaseMapper.selectByExample(example);
            mv.addObject("orderList", orderList);
            Double amount=0.00;
            for(OrderRelease orderRelease:orderList){
                amount+=orderRelease.getOrdersAmount();
            }
            mv.addObject("amount", amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }


    /*
     * @author 王鹏飞
     * @notes 跳转评价页面
     * @date 2018/9/1 15:22
     * @param
     * @return
     */
    @RequestMapping("/toOrderEvaluation")
    public String toOrderEvaluation(HttpServletRequest request,String id,Model model){

        OrderRelease orderRelease = iOrderService.selectByPrimaryKey(Integer.parseInt(id));
        //运力信息主键 运力信息的id，陆运车源id或者海运运力id
        Integer transportId = orderRelease.getTransportId();
        //货运方式，1陆运2海运3联运4航运
        Integer transportMode = orderRelease.getTransportMode();
        //订单信息id
        Integer orderId = Integer.parseInt(id);
        if (1 == transportMode) {//陆运
            Evaluation evaluation = evaluationMapper.selectByOrderIdLand(orderId);
            model.addAttribute("evaluation",evaluation);
        } else if (2 == transportMode) {//海运
            Evaluation evaluation = evaluationMapper.selectByOrderIdOcean(transportId);
            model.addAttribute("evaluation",evaluation);
        } else if (3 == transportMode) {//联运

        } else if (4 == transportMode) {//航运

        }
        model.addAttribute("orderRelease",orderRelease);
        EvaluationExample  evaluationExample = new EvaluationExample();
        EvaluationExample.Criteria criteria=evaluationExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<Evaluation> list = evaluationMapper.selectByExample(evaluationExample);
        if(list != null && list.size()>0){
            model.addAttribute("list",list.get(0));
        }
        return "order/orderEvaluation";
    }

    /*
     * @author 王鹏飞
     * @notes 提交评价
     * @date 2018/9/1 15:42
     * @param
     * @return
     */
    @RequestMapping("/saveOrderEvaluation")
    @ResponseBody
    public Map<String,Object> saveOrderEvaluation(Evaluation evaluation){
        evaluation.setFlag(1);
        Map<String,Object> map = null;
        try {
            map = iOrderService.saveOrderEvaluation(evaluation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    /*
     * @author 王鹏飞
     * @notes 跳转投诉页面
     * @date 2018/9/2 15:22
     * @param
     * @return
     */
    @RequestMapping("/toOrderComplain")
    public String toOrderComplain(HttpServletRequest request,String id,Model model){
        ModelAndView view = new ModelAndView();
        OrderRelease orderRelease = orderReleaseMapper.selectByPrimaryKeyID(Integer.parseInt(id));
        Complain complain = new Complain();
        complain.setOrdersNum(orderRelease.getOrdersNum());
        complain.setOrderId(orderRelease.getId());
        ComplainExample  complainExample = new ComplainExample();
        ComplainExample.Criteria criteria=complainExample.createCriteria();
        criteria.andOrderIdEqualTo(Integer.parseInt(id));
        List<Complain> list = complainMapper.selectByExample(complainExample);
        if(list != null && list.size()>0){
            model.addAttribute("list",list.get(0));
        }
        model.addAttribute("complain",complain);
        return "order/orderComplain";
    }

    /*
     * @author 王鹏飞
     * @notes 提交投诉
     * @date 2018/9/2 15:42
     * @param
     * @return
     */
    @RequestMapping("/saveOrderComplain")
    @ResponseBody
    public Map saveOrderComplain(Complain complain){
        Map<String,Object> map = null;
        try {
            map = iOrderService.saveOrderComplain(complain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    @RequestMapping("/toOrderManagementDetail")
    public ModelAndView toOrderManagementDetail(Integer id, String flg) {
        ModelAndView view = new ModelAndView();
        OrderRelease orderRelease = iOrderService.selectByPrimaryKey(id);
        //运力信息主键 运力信息的id，陆运车源id或者海运运力id
        Integer transportId = orderRelease.getTransportId();
        //货运方式，1陆运2海运3联运4航运
        Integer transportMode = orderRelease.getTransportMode();
        Object obj = null;
        if (1 == transportMode) {//陆运
            LandTransportationExample example = new LandTransportationExample();
            LandTransportationExample.Criteria criteria = example.createCriteria();
            criteria.andorderIdEqualTo(orderRelease.getId());
            List<LandTransportation> list = landTransportationMapper.selectByExample(example);
//            obj=transportationService.findTransportationById(transportId);
            if (list != null && list.size() > 0) {
                obj = list.get(0).getUserName();
                List<CarInformation> carList = new ArrayList<CarInformation>();
                for (LandTransportation land : list) {
                    CarInformation car = carInformationService.findCarById(land.getCarInformationId());
                    UserFront userFront=userFrontMapper.selectByPrimaryKey(car.getUserId());
                    if(userFront.getIdentityType()==1){//个人
                        List<PersonalInfo> personalInfos = personalInfoMapper.selectByUserId(userFront.getUserId());
                        if (personalInfos != null && personalInfos.size() > 0) {
                            PersonalInfo personalInfo = personalInfos.get(0);
                            car.setPhone(personalInfo.getTel());
                        }
                    }
                    if(userFront.getIdentityType()==2){//企业
                        List<EnterpriseInfo> enterpriseInfos = enterpriseInfoMapper.selectByUserId(userFront.getUserId());
                        if (enterpriseInfos != null && enterpriseInfos.size() > 0) {
                            EnterpriseInfo enterpriseInfo = enterpriseInfos.get(0);
                            car.setPhone(enterpriseInfo.getEnterpriseTel());
                        }
                    }
                    SyscodeExample example1=new SyscodeExample();
                    SyscodeExample.Criteria criteria1=example1.createCriteria();
                    criteria1.andTypeEqualTo("1");
                    criteria1.andCodeEqualTo(car.getCarType());
                    List<Syscode> syscode= syscodeMapper.selectByExample(example1);
                    car.setCarType(syscode.get(0).getName());
                    carList.add(car);
                }
//                CarInformation car = carInformationService.findCarById(((LandTransportation) obj).getCarInformationId());
                view.addObject("car", carList);
                Integer carrierId = orderRelease.getCarrierId();
                UserFront user = userFrontService.findById(carrierId);
                String tel = "";
                if (user.getIdentityType() == 1) {//公司
                    List<EnterpriseInfo> enterpriseInfos = enterpriseInfoMapper.selectByUserId(carrierId);
                    if (enterpriseInfos != null && enterpriseInfos.size() > 0) {
                        EnterpriseInfo enterpriseInfo = enterpriseInfos.get(0);
                        tel = enterpriseInfo.getEnterpriseTel();
                    }
                } else {//个人
                    List<PersonalInfo> personalInfos = personalInfoMapper.selectByUserId(carrierId);
                    if (personalInfos != null && personalInfos.size() > 0) {
                        PersonalInfo personalInfo = personalInfos.get(0);
                        tel = personalInfo.getTel();
                    }
                }
                view.addObject("tel", tel);
            }
        } else if (2 == transportMode) {//海运
            obj = transportationService.findOceanTransportationById(transportId);
        } else if (3 == transportMode) {//联运

        } else if (4 == transportMode) {//航运

        }
        orderRelease.setWeight(MD5Util.weight(orderRelease.getWeight()));
        view.addObject("transportMode", transportMode);
        view.addObject("obj", orderRelease);
        view.addObject("tran", obj);
        view.setViewName("order/orderInformation");
        if (flg != null && !"".equals(flg)) {
            view.addObject("flg", flg);
        }
        return view;
    }

   /* @RequestMapping("/saveOffer")
    public String saveOffer(HttpServletRequest request){
        try {
            String offer=request.getParameter("offer");
            String id=request.getParameter("id");
            if (offer!=null&&!"".equals(offer)&&id!=null&&!"".equals(id)){
                DecimalFormat df = new DecimalFormat( "0.00");
                OrderRelease orderRelease=iOrderService.selectByPrimaryKey(Integer.parseInt(id));
                orderRelease.setOffer(Double.parseDouble(df.format(Double.parseDouble(offer))));
                iOrderService.updateOrderRelease(orderRelease);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/order/toOrderManagement";
    }*/

    @RequestMapping("/deliverGoods")
    public String deliverGoods(HttpServletRequest request,@RequestParam("file") MultipartFile files) {
        try {
            String resultPath = "";
            if (!files.isEmpty()){
                resultPath = uploadFile(resultPath,files);
            }
            String id = request.getParameter("id");
            OrderRelease orderRelease = orderReleaseMapper.selectByPrimaryKey(Integer.parseInt(id));
//            orderRelease.setId(Integer.parseInt(id));
            if(orderRelease!=null&&orderRelease.getOrdersFlag()==201){
                orderRelease.setOrdersFlag(202);
            }
            orderRelease.setOrderDocument(resultPath);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            orderRelease.setDeliveryTime(sdf.format(new Date()));
            orderReleaseMapper.updateByPrimaryKeySelective(orderRelease);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/order/toOrderManagement";
    }

    public String uploadFile(String resultPath,MultipartFile files) throws IOException {
        String type = files.getOriginalFilename().substring(files.getOriginalFilename().indexOf("."));//取后缀名
        String fileName = System.currentTimeMillis()+type;//取当前时间搓作为文件名
        String path = this.getPropertiesVal("receptionUploadUrl");
        File filepath = new File(path,fileName);
        //判断路径是否存在，如果不存在就创建一个
        if (!filepath.getParentFile().exists()) {
            filepath.getParentFile().mkdirs();
        }
        //将上传文件保存到一个目标文件当中
        resultPath =fileName;
        String savePath = path + File.separator + fileName;
        files.transferTo(new File(savePath));
        return resultPath;
    }

    public String getPropertiesVal(String val){
//        ResourceBundle res = ResourceBundle.getBundle("uploadUrl.properties");
        Properties properties = new Properties();

        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("uploadUrl.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String test = properties.getProperty(val);
        return test;
    }


    @RequestMapping("/collectGoods")
    public String collectGoods(HttpServletRequest request,@RequestParam("file") MultipartFile files) {
        try {
            String resultPath = "";
            if (!files.isEmpty()){
                resultPath = uploadFile(resultPath,files);
            }
            String id = request.getParameter("id");
            OrderRelease orderRelease = orderReleaseMapper.selectByPrimaryKey(Integer.parseInt(id));
//            orderRelease.setId(Integer.parseInt(id));
            if(orderRelease!=null&&orderRelease.getOrdersFlag()==202){
                orderRelease.setOrdersFlag(2);
            }
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            orderRelease.setTakeDeliveryTime(sdf.format(new Date()));
            orderRelease.setOrderDocuments(resultPath);
            orderReleaseMapper.updateByPrimaryKeySelective(orderRelease);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/order/toOrderManagement";
    }

    public List<OrderRelease> getList(List<OrderRelease> orderList, Page page) {
        int row = page.getStartRow() + page.getPageSize();
        List list = new ArrayList();
        if (orderList.size() >= page.getStartRow()) {
            if (orderList.size() >= row) {
                for (int i = page.getStartRow(); i < row; i++) {
                    UserFront user = userFrontMapper.selectByPrimaryKey(orderList.get(i).getCarrierId());
                    if (user != null && (user.getUserName() != null || "".equals(user.getUserName()))) {
                        orderList.get(i).setUserName(user.getUserName());
                    }
                    list.add(orderList.get(i));
                }
            } else if (orderList.size() < row) {
                for (int i = page.getStartRow(); i < orderList.size(); i++) {
                    UserFront user = userFrontMapper.selectByPrimaryKey(orderList.get(i).getCarrierId());
                    if (user != null && (user.getUserName() != null || "".equals(user.getUserName()))) {
                        orderList.get(i).setUserName(user.getUserName());
                    }
                    list.add(orderList.get(i));
                }
            }
        }
        return list;
    }


    //匹配车辆页面
    @RequestMapping("/vehicleMatch")
    public ModelAndView vehicleMatch(HttpServletRequest request,String id) {
        ModelAndView mv=new ModelAndView("/order/vehicleMatch");
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            OrderRelease orderRelease = orderReleaseMapper.selectByPrimaryKey(Integer.parseInt(id));
            UserFront user=userFrontMapper.selectByPrimaryKey(orderRelease.getOwnerId());
            orderRelease.setUserName(user.getUserName());
            String weight=orderRelease.getWeight();
            String weig=weight.substring(weight.length()-1,weight.length());
            if("吨".equals(weig)){
                orderRelease.setWeight(weight.substring(0,weight.indexOf("/")));
            }else{
                orderRelease.setWeight(weight.substring(0,weight.indexOf("*")));
            }
            mv.addObject("orderRelease",orderRelease);
            CarInformationExample example=new CarInformationExample();
            CarInformationExample.Criteria criteria=example.createCriteria();
            criteria.andStatuEqualTo(2);
            criteria.andUserIdEqualTo(userFront.getUserId());
            List<CarInformation> listCar=carInformationMapper.selectByExample(example);
            for(CarInformation car:listCar){
                SyscodeExample example1=new SyscodeExample();
                SyscodeExample.Criteria criteria1=example1.createCriteria();
                criteria1.andTypeEqualTo("1");
                criteria1.andCodeEqualTo(car.getCarType());
                List<Syscode> syscode=syscodeMapper.selectByExample(example1);
                if(syscode!=null&&syscode.size()>0){
                    car.setCarType(syscode.get(0).getName());
                }
                UserFront userFront1=userFrontMapper.selectByPrimaryKey(car.getUserId());
                if(userFront1.getIdentityType()==1){//个人
                    PersonalInfoExample example2=new PersonalInfoExample();
                    PersonalInfoExample.Criteria criteria2=example2.createCriteria();
                    criteria2.andUserIdEqualTo(car.getUserId());
                    List<PersonalInfo> personalInfo=personalInfoMapper.selectByExample(example2);
                    if(personalInfo!=null&&personalInfo.size()>0){
                        car.setPhone(personalInfo.get(0).getTel());
                    }
                }
                if (userFront1.getIdentityType()==2){//企业
                    EnterpriseInfoExample example2=new EnterpriseInfoExample();
                    EnterpriseInfoExample.Criteria criteria2=example2.createCriteria();
                    criteria2.andUserIdEqualTo(car.getUserId());
                    List<EnterpriseInfo> enterpriseInfos=enterpriseInfoMapper.selectByExample(example2);
                    if(enterpriseInfos!=null&&enterpriseInfos.size()>0){
                        car.setPhone(enterpriseInfos.get(0).getEnterpriseTel());
                    }
                }
            }
            mv.addObject("listCar",listCar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    //匹配车辆
    @RequestMapping("/doVehicleMatch")
    public String doVehicleMatch(HttpServletRequest request,String orderId,String carIds) {
        try {
            OrderRelease orderRelease=orderReleaseMapper.selectByPrimaryKey(Integer.parseInt(orderId));
            String [] ids=carIds.split(",");
            for(String id:ids){
                if(!"0".equals(id)){
                    CarInformation carInformation=carInformationMapper.selectByPrimaryKey(Integer.parseInt(id));
                    LandTransportation landTransportation=new LandTransportation();
                    landTransportation.setCarBrand(carInformation.getCarBrand());
                    landTransportation.setCarInformationId(Integer.parseInt(id));
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    landTransportation.setDepartureStartTime(sdf.format(new Date()));
                    landTransportation.setDepartureEndTime(orderRelease.getTransactionTime());
                    landTransportation.setDeparture(orderRelease.getStartAddress());
                    landTransportation.setDestination(orderRelease.getArriveAddress());
                    landTransportation.setStatus(4);
                    landTransportation.setOrderId(Integer.parseInt(orderId));
                    landTransportation.setUserName(carInformation.getUserName());
                    landTransportationMapper.insertSelective(landTransportation);
                }
            }
            orderRelease.setOrdersFlag(201);
            orderReleaseMapper.updateByPrimaryKeySelective(orderRelease);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/order/toOrderManagement";
    }
}


