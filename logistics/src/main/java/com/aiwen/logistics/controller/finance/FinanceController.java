package com.aiwen.logistics.controller.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ASUS on 2018/5/12.
 */
@Controller
@RequestMapping("/finance")
public class FinanceController {


    @RequestMapping("/finance")
    public ModelAndView index(){
        return new ModelAndView("finance/finance");
    }
}
