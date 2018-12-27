package com.aiwen.logistics.controller.report;

import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.pojo.OrderRelease;
import com.aiwen.logistics.pojo.OrderReleaseExample;
import com.aiwen.logistics.pojo.UserFront;
import com.aiwen.logistics.util.ReportUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by ASUS on 2018/9/17.
 */
@Controller
@RequestMapping(value = "/report")
public class ReportController {


    @Autowired
    private OrderReleaseMapper orderReleaseMapper;
    /**
     * 导出报表
     * @return
     */
    @RequestMapping(value = "/export")
    @ResponseBody
    public ModelAndView export(HttpServletRequest request, HttpServletResponse response, @Param("year") String year, @Param("month")String month) throws Exception {
        //获取数据
//        List<PageData> list = reportService.bookList(page);
        ModelAndView mv = new ModelAndView("order/orderAccount");
        List<OrderRelease> orderList = null;
        HttpSession session = request.getSession();
        UserFront userFront = (UserFront) session.getAttribute("userFront");
        String time="";
        try {
            OrderReleaseExample example = new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria = example.createCriteria();
           /* if (!"".equals(orderNum) && orderNum != null) {
                criteria.andOrdersNumLike("%" + orderNum + "%");
                mv.addObject("orderNum", orderNum);
            }*/
            Calendar cale = null;
            cale = Calendar.getInstance();
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
            orderList = orderReleaseMapper.selectByExample(example);
            mv.addObject("orderList", orderList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] title = null;
        String fileName = null;
        String sheetName =null;
        Integer hang=0;
        String text7="                                                            *费用：          □ 含税  ■ 未税                              *币种：    ■人民币         □美金";
        String text1=year+"年"+month+"月对账单 （承运人）";
        if ("1".equals(userFront.getAccountType())) {//货主
            //excel标题
            title = new String[]{"序号","订单编号","订单确认时间","货物名称","实际货量","单位","单价（含税）","其他费用（含税）","税率","总额（含税）","备注"};
            //excel文件名
            fileName = "托运人对账单（经维）-"+userFront.getUserName()+".xls";

            //sheet名
            sheetName = "托运人对账单（经维）";
            hang=8;
            text7="                                                            *费用：          ■ 含税  □ 未税                               *币种：    ■人民币         □美金";
            text1=year+"年"+month+"月对账单 （托运人）";
        }
        if ("2".equals(userFront.getAccountType())) {//承运方
            title = new String[]{"序号","订单编号","订单确认时间","货物名称","实际货量","单位","单价（未税）","其他费用（未税）","总额（未税）","备注"};
            //excel文件名
            fileName = "承运人对账单（经维）-"+userFront.getUserName()+".xls";

            //sheet名
            sheetName = "承运人对账单（经维）";
            hang=7;
        }
        String[][] content=new String[orderList.size()+10][title.length];
        for (int i = 0; i < orderList.size(); i++) {
//            PageData obj = list.get(i);
//            content[i][0] = obj.get("stuName").tostring();
            content[i+9][0] = (i+1)+"";
            content[i+9][1] = orderList.get(i).getOrdersNum();
            content[i+9][2] = orderList.get(i).getDeliveryTime();
            content[i+9][3] = orderList.get(i).getReleaseSource().getGoods();
            content[i+9][4] = orderList.get(i).getActualWeight()+"";
            content[i+9][5] = orderList.get(i).getCompany();
            content[i+9][6] = orderList.get(i).getUnitPrice()+"";
            content[i+9][7] = orderList.get(i).getOtherAmount()+"";
            if ("1".equals(userFront.getAccountType())) {//货主
                //excel标题
                content[i+9][8] = "10%";
                content[i+9][9] = orderList.get(i).getOrdersAmount()+"";
                content[i+9][10] = orderList.get(i).getRemark();
            }
            if ("2".equals(userFront.getAccountType())) {//承运方
                content[i+9][8] = orderList.get(i).getOrdersAmount()+"";
                content[i+9][9] = orderList.get(i).getRemark();
            }
        }
        CellRangeAddress callRangeAddress = new CellRangeAddress(orderList.size()+10,orderList.size()+10,0,hang);//起始行,结束行,起始列,结束列
        CellRangeAddress callRangeAddress1 = new CellRangeAddress(orderList.size()+11,orderList.size()+11,0,hang+2);//起始行,结束行,起始列,结束列
        CellRangeAddress callRangeAddress2 = new CellRangeAddress(orderList.size()+12,orderList.size()+12,0,hang+2);//起始行,结束行,起始列,结束列
        CellRangeAddress callRangeAddress3 = new CellRangeAddress(orderList.size()+13,orderList.size()+13,0,hang+2);//起始行,结束行,起始列,结束列
        CellRangeAddress callRangeAddress4 = new CellRangeAddress(orderList.size()+14,orderList.size()+14,0,hang+2);//起始行,结束行,起始列,结束列
        CellRangeAddress callRangeAddress5 = new CellRangeAddress(orderList.size()+15,orderList.size()+15,0,hang+2);//起始行,结束行,起始列,结束列
        Double amount=0.00;
        if(orderList!=null&&orderList.size()>0){
            for(OrderRelease orderRelease:orderList){
                amount+=orderRelease.getOrdersAmount();
            }
            mv.addObject("amount", amount);
        }
        //创建HSSFWorkbook
        HSSFWorkbook wb = ReportUtil.getHSSFWorkbook(sheetName, title, content, null);
        //合并的单元格样式
        HSSFCellStyle boderStyle = wb.createCellStyle();
        HSSFCellStyle style = wb.createCellStyle();
        HSSFCellStyle style1 = wb.createCellStyle();
        //样式-------------------------------------------------------
        //垂直居中
        boderStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        boderStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        HSSFFont font2 = wb.createFont();
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        font2.setFontHeightInPoints((short) 10);
        boderStyle.setFont(font2);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        font.setFontHeightInPoints((short) 15);
        style.setFont(font);
        style1.setFont(font2);
        CellStyle cellStyle=wb.createCellStyle();
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN); // 底部边框
        cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex()); // 底部边框颜色

        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);  // 左边边框
        cellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex()); // 左边边框颜色

        cellStyle.setBorderRight(CellStyle.BORDER_THIN); // 右边边框
        cellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());  // 右边边框颜色

        cellStyle.setBorderTop(CellStyle.BORDER_THIN); // 上边边框
        cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());  // 上边边框颜色
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        cellStyle.setFont(font2);
        HSSFRow rowTitle = wb.getSheet(sheetName).createRow(9);
        for(int i=0;i<title.length;i++){
            if(i==1){
                wb.getSheet(sheetName).setColumnWidth(i,20*256);
            }else{
                wb.getSheet(sheetName).setColumnWidth(i,13*256);
            }
            HSSFCell cellinfo = rowTitle.createCell(i);
            cellinfo.setCellStyle(cellStyle);
            cellinfo.setCellValue(title[i]);
        }
        //
        CellRangeAddress callRangeAddress01 = new CellRangeAddress(0,1,0,hang+2);//起始行,结束行,起始列,结束列
//        CellRangeAddress callRangeAddress02 = new CellRangeAddress(2,2,0,hang+2);//起始行,结束行,起始列,结束列
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress01);
        HSSFRow row1 = wb.getSheet(sheetName).createRow(0);
        HSSFCell cell1 = row1.createCell(0);
        //加载单元格样式
        cell1.setCellValue(text1);
        cell1.setCellStyle(style);
//        wb.getSheet(sheetName).addMergedRegion(callRangeAddress02);
        HSSFRow rower1 = wb.getSheet(sheetName).createRow(1);
        rower1.setRowStyle(style1);
        HSSFRow rower2 = wb.getSheet(sheetName).createRow(2);
        rower2.setRowStyle(style1);
        HSSFRow rower = wb.getSheet(sheetName).createRow(3);
        HSSFCell celler = rower.createCell(0);
        //加载单元格样式
        celler.setCellValue("                                                            *用户名称：       "+userFront.getUserName());
        celler.setCellStyle(style1);
        HSSFRow rower4 = wb.getSheet(sheetName).createRow(4);
        HSSFCell celler4 = rower4.createCell(0);
        //加载单元格样式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf1.parse(orderList.get(0).getCompleteTime()));
        celler4.setCellValue("                                                            *对账日期：      "+date+"                                  *对账周期： "+time+"-01~"+time+"-"+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        celler4.setCellStyle(style1);
        HSSFRow rower5 = wb.getSheet(sheetName).createRow(5);
        HSSFCell celler5 = rower5.createCell(0);
        //加载单元格样式
        celler5.setCellValue("                                                            *付款条件：       到付");
        celler5.setCellStyle(style1);
        HSSFRow rower6 = wb.getSheet(sheetName).createRow(6);
        HSSFCell celler6 = rower6.createCell(0);
        //加载单元格样式
        celler6.setCellValue(text7);
        celler6.setCellStyle(style1);
        HSSFRow rower7 = wb.getSheet(sheetName).createRow(7);
        HSSFCell celler7 = rower7.createCell(0);
        //加载单元格样式
        celler7.setCellValue("                                                            经维路通平台对账人：   ");
        celler7.setCellStyle(style1);
        HSSFRow rower8 = wb.getSheet(sheetName).createRow(8);
        rower8.setRowStyle(style1);

        //
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress);
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress1);
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress2);
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress3);
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress4);
        wb.getSheet(sheetName).addMergedRegion(callRangeAddress5);
        HSSFRow rowinfo = wb.getSheet(sheetName).createRow(orderList.size()+10);
        HSSFCell cellinfo = rowinfo.createCell(0);
        HSSFCell cellinfo1 = rowinfo.createCell(title.length-2);
        for(int i=0;i<title.length;i++){
            HSSFCell cell = rowinfo.createCell(i);
            cell.setCellStyle(cellStyle);
            if(i==0){
                cell.setCellValue("汇总：");
            }
            if(i==title.length-2){
                cell.setCellValue(amount+"");
            }
        }
//        cellinfo.setCellStyle(cellStyle);
//        cellinfo1.setCellStyle(cellStyle);
//        cellinfo.setCellValue("汇总：");
//        cellinfo1.setCellValue(amount+"");
        HSSFRow rowinfo3 = wb.getSheet(sheetName).createRow(orderList.size()+13);
        HSSFCell cellinfo3 = rowinfo3.createCell(0);
        cellinfo3.setCellValue("备注：");
        HSSFRow rowinfo4 = wb.getSheet(sheetName).createRow(orderList.size()+14);
        HSSFCell cellinfo4 = rowinfo4.createCell(0);
        cellinfo4.setCellValue("1、以电子档为凭据，托运人对账后邮件回复确认；");
        HSSFRow rowinfo5 = wb.getSheet(sheetName).createRow(orderList.size()+15);
        HSSFCell cellinfo5 = rowinfo5.createCell(0);
        cellinfo5.setCellValue("2、托运人确认后的对账单加盖公章或合同专用章后，电子版上传，以便经维路通平台存档；");
        //响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
