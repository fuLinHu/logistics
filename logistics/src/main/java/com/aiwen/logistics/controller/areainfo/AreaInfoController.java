package com.aiwen.logistics.controller.areainfo;

import com.aiwen.logistics.pojo.AreaInfo;
import com.aiwen.logistics.service.IAreaInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 17:59
 */
@Controller
@RequestMapping("/areainfo")
public class AreaInfoController {
    Logger logger = LogManager.getLogger(this.getClass().getName());
    /*
     * @author 董传斌
     * @notes 查询所有省份
     * @date 2018/4/25 10:39
     * @param
     * @return
     */
    @Autowired
    private IAreaInfoService areaInfosService;
    @RequestMapping("/provinceList")
    @ResponseBody
    public List<AreaInfo> provinceList(){
        List<AreaInfo> provinces = areaInfosService.findProvince();
        return  provinces;
    }

    /*
     * @author 董传斌
     * @notes 根据省份id查询下属城市
     * @date 2018/4/25 10:39
     * @param
     * @return
     */
    @RequestMapping("/cityList")
    @ResponseBody
    public List<AreaInfo> cityList(String province){
        logger.info("======根据省份查询下属城市=======省份id:"+province);
        List<AreaInfo> citys = areaInfosService.findByProvince(province);
        logger.info("======根据省份查询下属城市=======结束");
        return citys;
    }
    /*
     * @author 董传斌
     * @notes 根据城市id查询下属区县
     * @date 2018/4/25 10:40
     * @param
     * @return
     */
    @RequestMapping("/areaList")
    @ResponseBody
    public List<AreaInfo> areaList(String city){
        logger.info("======根据城市查询下属区县=======城市id:"+city);
        List<AreaInfo> areas = areaInfosService.findByCity(city);
        logger.info("======根据城市查询下属虚线=======结束");
        return areas;
    }

}
