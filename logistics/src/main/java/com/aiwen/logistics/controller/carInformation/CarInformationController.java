package com.aiwen.logistics.controller.carInformation;

import com.aiwen.logistics.pojo.CarInformation;
import com.aiwen.logistics.service.ICarInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/5/4 11:37
 */
@Controller
@RequestMapping("/carInformation")
public class CarInformationController {
    @Autowired
    private ICarInformationService carInformationService;
    @RequestMapping("/changeCarBrand")
    @ResponseBody
    public Map<String,Object> changeCarBrand(@RequestParam("id") Integer id){
        Map<String,Object> map = carInformationService.findCarInformationById(id);
        return map;
    }

}
