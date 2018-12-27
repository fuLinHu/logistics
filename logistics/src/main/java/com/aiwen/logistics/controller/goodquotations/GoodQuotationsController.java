package com.aiwen.logistics.controller.goodquotations;

import com.aiwen.logistics.pojo.GoodQuotations;
import com.aiwen.logistics.pojo.GoodQuotationsExample;
import com.aiwen.logistics.pojo.Page;
import com.aiwen.logistics.pojo.ReleaseSource;
import com.aiwen.logistics.service.GoodQuotationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by ASUS on 2018/4/26.
 */
@Controller
@RequestMapping("/goodQuotations")
public class GoodQuotationsController {

    @Autowired
    private GoodQuotationsService goodQuotationsService;

    @RequestMapping("/goodQuotationsList")
    public ModelAndView goodQuotationsList(Integer pageSize,Integer pageNo){
        ModelAndView modelAndView = new ModelAndView("goodquotations/goodquotations");
        try {
            GoodQuotationsExample example=new GoodQuotationsExample();
            GoodQuotationsExample.Criteria criteria = example.createCriteria();
            criteria.andStateEqualTo(1);
            Page page=new Page();
            if (pageNo==null){
                pageNo=1;
            }
            if (pageSize==null){
                pageSize=10;
            }
            page.setPageNo(pageNo);
            page.setPageSize(pageSize);
            example.setOrderByClause("id");
            List<GoodQuotations> list=goodQuotationsService.findGoodQuotationsList(example);
            modelAndView.addObject("totalCount",list.size());
            Integer num=list.size()/pageSize;
            if (list.size()%pageSize!=0){
                num+=1;
            }
            modelAndView.addObject("pageSize",pageSize);
            modelAndView.addObject("number",num);
            modelAndView.addObject("pageNo",pageNo);
            List<GoodQuotations> listGoodQuotations=new ArrayList<GoodQuotations>();
            int row=page.getStartRow()+page.getPageSize();
            if (list.size()>=page.getStartRow()){
                if(list.size()>=row){
                    for(int i=page.getStartRow();i<row;i++){
                        listGoodQuotations.add(list.get(i));
                    }
                }else if(list.size()<row){
                    for(int i=page.getStartRow();i<list.size();i++){
                        listGoodQuotations.add(list.get(i));
                    }
                }
            }
            modelAndView.addObject("list",listGoodQuotations);
        }catch (Exception e){
            e.printStackTrace();
        }
        return modelAndView;
    }
}
