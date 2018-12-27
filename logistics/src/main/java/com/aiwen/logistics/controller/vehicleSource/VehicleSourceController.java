package com.aiwen.logistics.controller.vehicleSource;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.aiwen.logistics.dao.DriverInformationMapper;
import com.aiwen.logistics.dao.GrabSourceMapper;
import com.aiwen.logistics.dao.LandTransportationMapper;
import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.dao.ReleaseSourceMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.*;
import com.aiwen.logistics.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 10:53
 */
@Controller
@RequestMapping("/vehicleSource")
public class VehicleSourceController {
    @Autowired
    private ITransportationService transportationService;
    @Autowired
    private ICarInformationService carInformationService;
    @Autowired
    private ISyscodeService syscodeService;
    @Autowired
    private IAreaInfoService areaInfoService;
    @Autowired
    private ReleaseSourceService releaseSourceService;
    @Autowired
    private GrabSourceMapper grabSourceMapper;
    @Autowired
    private OrderReleaseMapper orderReleaseMapper;
    @Autowired
    private ReleaseSourceMapper releaseSourceMapper;
    @Autowired
    private LandTransportationMapper landTransportationMapper;
    @Autowired
    private DriverInformationMapper driverInformationMapper;

    /*
     * @author 董传斌
     * @notes 信息发布页面
     * @date 2018/5/3 13:46
     * @param
     * @return
     */
    @RequestMapping("/defaultList")
    public String defaultList(HttpServletRequest request,Model model,@RequestParam(defaultValue = "1") Integer status
                              /*@RequestParam(defaultValue = "1") Integer carStatus*/){
        List<Map<String,Object>> landTransportations = null;
        List<Map<String,Object>> carInformations = null;
        String url="vehicleSource/InfoDiffusion";
        UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");
        if(userFront != null&&!"".equals(userFront)){
            if("1".equals(userFront.getAccountType())){
                url="releaseSource/orderRelease";
                List<ReleaseSource> list=releaseSourceService.findReleaseSourceListByUserId(userFront.getUserId());
                for (int i=0;i<list.size();i++){
                    list.get(i).setWeight(MD5Util.weight(list.get(i).getWeight()));
                }
                model.addAttribute("list",list);
            }else{
                landTransportations = transportationService.findTransportationByStatusV(
                        status,userFront.getAccountType(),userFront.getUserId(),userFront.getIdentityType());
                carInformations = carInformationService.findCarByStatus(userFront.getUserId());
            }
        }else{
            url="Login/login";
        }
        model.addAttribute("landTransportations",landTransportations);
        model.addAttribute("carInformations",carInformations);
        model.addAttribute("status",status);
        return url;
    }
    /*
     * @author 董传斌
     * @notes 跳转空车发布页面
     * @date 2018/5/3 17:22
     * @param
     * @return
     */
    @RequestMapping("/toAddTransportation")
    public String toAddInfoDiffusion(HttpServletRequest request,Model model){
        UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");
        List<CarInformation> carList = null;
        if(userFront != null){
            carList = carInformationService.findByUserId(userFront.getUserId());//逻辑代码
        }
        List<Syscode> allCarType = syscodeService.findAllByType("1");
        model.addAttribute("allCarType",allCarType);
        List<AreaInfo> provinces = areaInfoService.findProvince();
        model.addAttribute("userFront",userFront);//预设防止以后用到
        model.addAttribute("carList",carList);
        model.addAttribute("provinces",provinces);
        return "vehicleSource/InfoDiffusionAdd1";
    }
    /*
     * @author 董传斌
     * @notes 保存运力信息
     * @date 2018/5/5 19:00
     * @param
     * @return
     */
    @RequestMapping("/saveTransportation")
    public String saveTransportation(HttpServletRequest request, LandTransportation transportation,CarInformation carInformation){
        Map<String,Object> map = transportationService.saveTransportationAndCar(request,transportation,carInformation);//不确定需求要不要带返回值进行其他操作--预留返回map
        return "redirect:/vehicleSource/defaultList";
    }
    /*
     * @author 董传斌(杜宗昊改)
     * @notes 删除运力，，类似下线
     * @date 2018/5/4 15:39
     * @param
     * @return
     */
    @RequestMapping("/delectTransportation")
    @ResponseBody
    public Map<String,Object> delectTransportation(Integer delectId){
        Map<String,Object> map = null;
        try {
            map = transportationService.delectTransportation(delectId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    /*
     * @author 董传斌
     * @notes 下线车源重新上线、、不确定是否还需要
     * @date 2018/5/4 15:40
     * @param
     * @return
     */
    @RequestMapping("/relineTransportation")
    @ResponseBody
    public Map<String,Object> relineTransportation(Integer relineId){
        Map<String,Object> map = transportationService.relineTransportation(relineId);//返回map预设
        return map;
    }
    /*
     * @author 董传斌
     * @notes 上线动作，，上线已发布但是未上线的车源
     * @date 2018/5/4 15:41
     * @param
     * @return
     */
    @RequestMapping("/golineTransportation")
    @ResponseBody
    public Map<String,Object> golineTransportation(Integer golineId){
        Map<String,Object> map = transportationService.golineTransportation(golineId);
        return map;
    }

    /*
     * @author 董传斌
     * @notes 跳转至修改页面
     * @date 2018/5/5 19:01
     * @param
     * @return
     */
    @RequestMapping("/toUpdateTransportation")
    public String toUpdateTransportation(HttpServletRequest request,String carTypeName,Integer updateId,Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");//逻辑代码
        /*List<CarInformation> carList = null;
        if(userFront != null){
            carList = carInformationService.findByUserId(userFront.getUserId());//逻辑代码
        }*/
        LandTransportation transportation = transportationService.findTransportationById(updateId);
        List<AreaInfo> provinces = areaInfoService.findProvince();//所有省份
        List<AreaInfo> departureCityList = areaInfoService.findBelonged(transportation.getDepartureProvince());
        List<AreaInfo> destinationCityList = areaInfoService.findBelonged(transportation.getDestinationProvince());
        List<AreaInfo> departureAreaList = areaInfoService.findBelonged(transportation.getDepartureCity());
        List<AreaInfo> destinationAreaList = areaInfoService.findBelonged(transportation.getDestinationCity());
        AreaInfo departureCity = areaInfoService.findById(Integer.parseInt(transportation.getDepartureCity()));
        AreaInfo departureArea = areaInfoService.findById(Integer.parseInt(transportation.getDepartureArea()));
        AreaInfo destinationCity = areaInfoService.findById(Integer.parseInt(transportation.getDestinationCity()));
        AreaInfo destinationArea = areaInfoService.findById(Integer.parseInt(transportation.getDestinationArea()));
        AreaInfo destinationProvince = areaInfoService.findById(Integer.parseInt(transportation.getDestinationProvince()));
        AreaInfo departureProvince = areaInfoService.findById(Integer.parseInt(transportation.getDepartureProvince()));
        CarInformation carInformation = carInformationService.findCarById(transportation.getCarInformationId());
        model.addAttribute("userFront",userFront);//预设
        List<Syscode> allCarType = syscodeService.findAllByType("1");
        model.addAttribute("allCarType",allCarType);
        model.addAttribute("specification",carInformation.getCarLong()+"*"+carInformation.getCarWidth()+"*"+carInformation.getCarHigh());
        model.addAttribute("carLoad",carInformation.getCarLoad());
        model.addAttribute("carTypeName",carTypeName);
        model.addAttribute("provinces",provinces);
        model.addAttribute("departureCityList",departureCityList);
        model.addAttribute("destinationCityList",destinationCityList);
        model.addAttribute("departureAreaList",departureAreaList);
        model.addAttribute("destinationAreaList",destinationAreaList);
        model.addAttribute("transportation",transportation);
        model.addAttribute("departureCity",departureCity);
        model.addAttribute("departureArea",departureArea);
        model.addAttribute("departureProvince",departureProvince);
        model.addAttribute("destinationArea",destinationArea);
        model.addAttribute("destinationCity",destinationCity);
        model.addAttribute("destinationProvince",destinationProvince);
        return "vehicleSource/InfoDiffusionUpdate1";
    }

    /*
     * @author 董传斌
     * @notes 执行修改
     * @date 2018/5/5 19:01
     * @param
     * @return
     */
    @RequestMapping("/updateTransportation")
    public String updateTransportation(HttpServletRequest request, LandTransportation transportation,CarInformation carInformation){
        Map<String,Object> map = transportationService.updateTransportation(request,transportation,carInformation);//不确定需求要不要带返回值进行其他操作--预留返回map
        return "redirect:/vehicleSource/defaultList";
    }

    /*
     * @author 王鹏飞
     * @notes 跳转发布车辆页面
     * @date 2018/8/29 19:01
     * @param
     * @return
     */
    @RequestMapping("/toAddCarInformation")
    public String toAddCarInformation(HttpServletRequest request,Model model){
        UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");//逻辑代码
        List<Syscode> allCarType = syscodeService.findAllByType("1");
        List<AreaInfo> provinces = areaInfoService.findProvince();
        model.addAttribute("allCarType",allCarType);
        model.addAttribute("userId",userFront.getUserId());
        model.addAttribute("userName",userFront.getUserName());
        model.addAttribute("provinces",provinces);
        return "vehicleSource/InfoDiffusionAdd2";
    }
    /*
     * @author 王鹏飞
     * @notes 发布车辆信息
     * @date 2018/8/29 19:16
     * @param
     * @return
     */
    @RequestMapping("/saveCarInformation")
    @ResponseBody
    public Map<String,Object> saveCarInformation(CarInformation carInformation,DriverInformation driverInformation){
        carInformation.setStatu(1);
        Map<String,Object> map = null;//返回map预设返回值
        try {
             map = carInformationService.saveCarInformation(carInformation);
             driverInformation.setCarId(carInformation.getId());
             carInformationService.saveDriverInformation(driverInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    /*
     * @author 王鹏飞
     * @notes 跳转修改页面
     * @date 2018/8/31 19:16
     * @param
     * @return
     */
    @RequestMapping("/toUpdateCarInformation")
    public String toUpdateCarInformation(HttpServletRequest request,Integer updateCarId,Model model){
        CarInformation carInformation = carInformationService.findCarById(updateCarId);
        UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");//逻辑代码
        DriverInformation driverInformation = driverInformationMapper.selectByCarId(updateCarId);
        List<AreaInfo> provinces = areaInfoService.findProvince();//所有省份
        List<AreaInfo> registeredResidenceCityList = areaInfoService.findBelonged(driverInformation.getRegisteredResidenceProvince());
        List<AreaInfo> registeredResidenceTownList = areaInfoService.findBelonged(driverInformation.getRegisteredResidenceCity());
        AreaInfo registeredResidenceCity = areaInfoService.findById(Integer.parseInt(driverInformation.getRegisteredResidenceCity()));
        AreaInfo registeredResidenceTown = areaInfoService.findById(Integer.parseInt(driverInformation.getRegisteredResidenceTown()));
        AreaInfo registeredResidenceProvince = areaInfoService.findById(Integer.parseInt(driverInformation.getRegisteredResidenceProvince()));
        List<Syscode> allCarType = syscodeService.findAllByType("1");
        model.addAttribute("allCarType",allCarType);
        model.addAttribute("userId",userFront.getUserId());
        model.addAttribute("userName",userFront.getUserName());
        model.addAttribute("carInformation",carInformation);
        model.addAttribute("driverInformation",driverInformation);
        model.addAttribute("provinces",provinces);
        model.addAttribute("registeredResidenceCityList",registeredResidenceCityList);
        model.addAttribute("registeredResidenceTownList",registeredResidenceTownList);
        model.addAttribute("registeredResidenceCity",registeredResidenceCity);
        model.addAttribute("registeredResidenceTown",registeredResidenceTown);
        model.addAttribute("registeredResidenceProvince",registeredResidenceProvince);
        return "vehicleSource/InfoDiffusionUpdate2";
    }
    /*
     * @author 王鹏飞
     * @notes 执行修改
     * @date 2018/8/31 19:16
     * @param
     * @return
     */
    @RequestMapping("/updateCarInformation")
    @ResponseBody
     public Map<String,Object> updateCarInformation(CarInformation carInformation,DriverInformation driverInformation){
        carInformation.setStatu(1);
        Map<String,Object> map = null;//返回map预设返回值呢
        try {
            map = carInformationService.updateCarInformation(carInformation);
            driverInformation.setCarId(carInformation.getId());
            carInformationService.updateDriverInformation(driverInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
     }

     /*
      * @author 董传斌
      * @notes 删除车辆信息
      * @date 2018/5/5 19:52
      * @param
      * @return
      */
     @RequestMapping("/delectCarInformation")
     @ResponseBody
     public Map<String,Object> delectCarInformation(Integer delectCarId){
         Map<String,Object> map = carInformationService.delectCarInformation(delectCarId);
         return map;
     }

    /**
     *选择货源
     * @return
     */
    @RequestMapping("/goSelectSource")
    public ModelAndView goSelect(HttpServletRequest request, String id){
        ModelAndView modelAndView = new ModelAndView("vehicleSource/selectSource");
        try {
            GrabSourceExample example=new GrabSourceExample();
            GrabSourceExample.Criteria criteria=example.createCriteria();
            criteria.andTransportIdEqualTo(Integer.parseInt(id));
            criteria.andStatusEqualTo(1);
            List<GrabSource> list=grabSourceMapper.selectByExample(example);
            if(list!=null&&list.size()>0){
                modelAndView.addObject("list",list);
            }else{
                modelAndView.addObject("message","暂无可选货源！");
            }
            modelAndView.addObject("id",id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  modelAndView;
    }

    /**
     *选择货源生成订单
     * @return
     */
    @RequestMapping("/selectSourceOk")
    public String releaseSourceOk(HttpServletRequest request,String landId,String sourceId){
        try {
            ReleaseSource releaseSource=releaseSourceService.findById(sourceId);
            //添加订单
            OrderRelease orderRelease=new OrderRelease();
            orderRelease.setOrdersFlag(201);//供应商选择货主的货源，生成订单，直接进入待发货状态
            //生成订单编号
            Long time= new Date().getTime();
            HttpSession session=request.getSession();
            UserFront user= (UserFront) session.getAttribute("userFront");
            String num=""+time;
            int length=18-num.length()-(user.getUserId()+"").length();
            for (int i=0;i<length;i++){
                num+=0;
            }
            num+=user.getUserId();
            orderRelease.setOrdersNum(num);
            orderRelease.setIsInvoice(0);
            orderRelease.setWeight(releaseSource.getWeight());
            orderRelease.setOrderReleaseSourceId(releaseSource.getSourceId());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            orderRelease.setCreateTime(sdf.format(new Date()));
            orderRelease.setTransportMode(releaseSource.getTransportType());
            orderRelease.setStartAddress(releaseSource.getStartAddress());
            orderRelease.setArriveAddress(releaseSource.getArriveAddress());
            orderRelease.setOwnerId(releaseSource.getUserId());
            orderRelease.setCarrierId(user.getUserId());
            orderRelease.setTransportId(Integer.parseInt(landId));
            orderRelease.setUnitPrice(releaseSource.getPlatOffer());
            orderReleaseMapper.insertSelective(orderRelease);
            releaseSource.setOrderState(7);
            releaseSourceMapper.updateByPrimaryKey(releaseSource);
            LandTransportation landTransportation=landTransportationMapper.selectByPrimaryKey(Integer.parseInt(landId));
            OrderReleaseExample example=new OrderReleaseExample();
            OrderReleaseExample.Criteria criteria=example.createCriteria();
            criteria.andOrdersNumEqualTo(num);
            List<OrderRelease> list=orderReleaseMapper.selectByExample(example);
            if(list!=null&&list.size()>0){
                landTransportation.setOrderId(list.get(0).getId());
                landTransportation.setStatus(4);
                landTransportationMapper.updateByPrimaryKey(landTransportation);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:defaultList";
    }


}
