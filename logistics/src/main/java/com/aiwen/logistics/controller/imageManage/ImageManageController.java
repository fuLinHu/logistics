package com.aiwen.logistics.controller.imageManage;


import com.aiwen.logistics.pojo.HotFreight;
import com.aiwen.logistics.pojo.HotSource;
import com.aiwen.logistics.pojo.ShipDynamic;
import com.aiwen.logistics.pojo.imageManage;
import com.aiwen.logistics.service.ImageManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2018/4/21.
 */
@Controller
@RequestMapping("/imageManage")
public class ImageManageController {

    @Autowired
    private ImageManageService imageManageService;
    @RequestMapping("getImageUrls")
    @ResponseBody
    public List<imageManage> findImageUrls(String imageType){
        return this.imageManageService.findByImageType(imageType);
    }

    @RequestMapping("getHotSource")
    @ResponseBody
    public List<HotSource> findHotSource(){
        return this.imageManageService.findHotSource();
    }

    @RequestMapping("getHotFreight")
    @ResponseBody
    public List<HotFreight> findHotFreight(){
        return this.imageManageService.findHotFreight();
    }

    @RequestMapping("getShipDynamic")
    @ResponseBody
    public List<ShipDynamic> findShipDynamic(){
        return this.imageManageService.findShipDynamic();
    }

}
