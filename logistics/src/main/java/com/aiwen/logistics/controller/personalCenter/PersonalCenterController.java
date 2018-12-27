package com.aiwen.logistics.controller.personalCenter;

import com.aiwen.logistics.pojo.StatisticsVo;
import com.aiwen.logistics.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ASUS on 2018/4/28.
 */
@Controller
@RequestMapping("/personalCenter")
public class PersonalCenterController {

    @Autowired
    private StatisticsService statisticsService;
    /**
     * 个人中心跳转页面（默认显示我的经维模块）
     */
    @RequestMapping("mySsc")
    public ModelAndView mySSC(HttpServletRequest request){
        ModelAndView mv=new ModelAndView("/personalCenter/mySsc");
        try {
            StatisticsVo statisticsVo=statisticsService.statistics(request);
            mv.addObject("statisticsVo",statisticsVo);
        }catch (Exception e){
            e.printStackTrace();
        }

        return mv;
    }
}
