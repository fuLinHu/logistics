package com.aiwen.logistics.controller.transportation;

import com.aiwen.logistics.dao.*;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.ISyscodeService;
import com.aiwen.logistics.service.ITransportationService;
import com.aiwen.logistics.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/4/25 17:47
 */
@Controller
@RequestMapping("/transportation")
public class TransportationController {
    @Autowired
    private ITransportationService transportationService;
    @Autowired
    private ISyscodeService syscodeService;
    @Autowired
    private LandTransportationMapper landTransportationMapper;
    @Autowired
    private CarInformationMapper carInformationMapper;
    @Autowired
    private SyscodeMapper syscodeMapper;
    @Autowired
    private ReleaseSourceMapper releaseSourceMapper;
    @Autowired
    private UserFrontMapper userFrontMapper;
    @Autowired
    private PersonalInfoMapper personalInfoMapper;
    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;
    @Autowired
    private GrabSourceMapper grabSourceMapper;


    @RequestMapping("/index")
    public String index(Model model){
        List<Syscode> carTypes = syscodeService.findAllByType("1");
        model.addAttribute("carTypes",carTypes);
        return "logistics/logisticsCenterSearch1";
    }
    /*
     * @author 董传斌
     * @notes 跳转海运运力s搜索页
     * @date 2018/5/10 10:02
     * @param
     * @return
     */
    @RequestMapping("/ocean")
    public String ocean(){
        return "logistics/logisticsCenterSearch2";
    }

    /*
     * @notes 跳转搜索1
     * @date 2018/5/10 10:05
     * @param
     * @return
     */
    @RequestMapping("/oceanTransportation")
    public String oceanTransportation(){
        return "logistics/oceanSearch1";
    }
    /*
         * @notes 空提示页
         * @date 2018/5/10 10:05
         * @param
         * @return
         */
    @RequestMapping("/oceanSearchResult1")
    public String oceanSearchResult1(){
        return "logistics/logisticsCenter2";
    }
    /*
         * @notes 空提示页
         * @date 2018/5/10 10:05
         * @param
         * @return
         */
    @RequestMapping("/oceanSearchResult2")
    public String oceanSearchResult2(){
        return "logistics/oceanCenter";
    }
    /*
        * @notes 跳转搜索1
        * @date 2018/5/10 10:05
        * @param
        * @return
        */
    @RequestMapping("/oceanSearch2")
    public String oceanSearch2(){
        return "logistics/oceanSearch2";
    }

    /*
     * @author 董传斌
     * @notes 陆运运力搜索
     * @date 2018/5/10 18:06
     * @param
     * @return
     */
    @RequestMapping("/search")
    public String searchTransportation(HttpServletRequest request,Integer pageSize,Integer pageNo,CarInformation carInformation,Model model){
        try {
            Page page = new Page();
            if (pageSize != null){
                page.setPageSize(pageSize);
            }
            if (pageNo == null){
                page.setPageNo(1);
            } else {
                page.setPageNo(pageNo);
            }
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            List<Map<String,Object>> landList = transportationService.findTransportationByStatusT(userFront,1,carInformation.getCarType(),
                    carInformation.getCarLong(),carInformation.getCarLoad(),page.getStartRow(),page.getStartRow()+page.getPageSize());
            List<Syscode> carTypes = syscodeService.findAllByType("1");
            Integer totalCount = transportationService.countAll(1, carInformation.getCarType(), carInformation.getCarLong(), carInformation.getCarLoad());
            Integer number = null;
            if(totalCount != null && totalCount > 0){
                number = totalCount/page.getPageSize();
                if (totalCount%page.getPageSize() != 0){
                    number += 1;
                }
            }
            model.addAttribute("pageNo",page.getPageNo());
            model.addAttribute("pageSize",page.getPageSize());
            model.addAttribute("number",number);
            model.addAttribute("totalCount",totalCount);
            model.addAttribute("carTypes",carTypes);
            model.addAttribute("carType",carInformation.getCarType());
            model.addAttribute("carLong",carInformation.getCarLong());
            model.addAttribute("carLoad",carInformation.getCarLoad());
            model.addAttribute("landList",landList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "logistics/logisticsCenter";
    }

    /*
     * @author 董传斌
     * @notes 海运运力搜索
     * @date 2018/5/10 18:07
     * @param
     * @return
     */
    @RequestMapping("/oceanSearch")
    public String oceanSearch(){
        return "logistics/logisticsCenter2";//需要添加路径
    }

    /*
     * @notes 抢车源
        * @date 2018/5/10 18:07
               * @param
        * @return
                */
    @RequestMapping("/goSelectSource")
    public ModelAndView goSelectSource(HttpServletRequest request,String id){
        ModelAndView mv=new ModelAndView("logistics/selectSource");
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            LandTransportation landTransportation=landTransportationMapper.selectByPrimaryKey(Integer.parseInt(id));
            CarInformation carInformation=carInformationMapper.selectByPrimaryKey(landTransportation.getCarInformationId());
            SyscodeExample example =new SyscodeExample();
            SyscodeExample.Criteria criteria=example.createCriteria();
            criteria.andCodeEqualTo(carInformation.getCarType());
            criteria.andTypeEqualTo("1");
            List<Syscode> list=syscodeMapper.selectByExample(example);
            if(list!=null&&list.size()>0){
                carInformation.setCarType(list.get(0).getName());
            }
            mv.addObject("carInformation",carInformation);
            mv.addObject("id",id);
            ReleaseSourceExample example1=new ReleaseSourceExample();
            ReleaseSourceExample.Criteria criteria1=example1.createCriteria();
            criteria1.andUserIdEqualTo(userFront.getUserId());
            criteria1.andOrderStateEqualTo(4);
            List<ReleaseSource> listReleaseSource=releaseSourceMapper.selectByExample(example1);
            for(ReleaseSource rs:listReleaseSource){
                rs.setWeight(MD5Util.weight(rs.getWeight()));
            }
            mv.addObject("listReleaseSource",listReleaseSource);
        }catch (Exception e){
            e.printStackTrace();
        }
        return mv;
    }


    /*
    * @notes 选择货源
       * @date 2018/5/10 18:07
              * @param
       * @return
               */
    @RequestMapping("/selectSource")
    public String selectSource(HttpServletRequest request,String releaseId,String transportId){
        try {
            HttpSession session=request.getSession();
            UserFront userFront= (UserFront) session.getAttribute("userFront");
            LandTransportation landTransportation=landTransportationMapper.selectByPrimaryKey(Integer.parseInt(transportId));
            CarInformation carInformation=carInformationMapper.selectByPrimaryKey(landTransportation.getCarInformationId());
            ReleaseSource releaseSource=releaseSourceMapper.selectByPrimaryKey(Integer.parseInt(releaseId));
            GrabSource grabSource=new GrabSource();
            grabSource.setTransportId(landTransportation.getId());
            grabSource.setCarId(carInformation.getId());
            grabSource.setSourceId(releaseSource.getSourceId());
            grabSource.setUserId(userFront.getUserId());
            grabSource.setUserName(userFront.getUserName());
            grabSource.setCarUserName(carInformation.getUserName());
            if(!"".equals(carInformation.getUserId())&&carInformation.getUserId()!=null){
                UserFront uf=userFrontMapper.selectByPrimaryKey(carInformation.getUserId());
                if(uf!=null&&uf.getIdentityType()==1){//个人
                    PersonalInfoExample example=new PersonalInfoExample();
                    PersonalInfoExample.Criteria criteria=example.createCriteria();
                    criteria.andUserIdEqualTo(uf.getUserId());
                    List<PersonalInfo> personalInfo=personalInfoMapper.selectByExample(example);
                    if(personalInfo!=null&&personalInfo.size()>0){
                        grabSource.setCarPhone(personalInfo.get(0).getTel());
                    }
                }
                if(uf!=null&&uf.getIdentityType()==2){//企业
                    EnterpriseInfoExample example=new EnterpriseInfoExample();
                    EnterpriseInfoExample.Criteria criteria=example.createCriteria();
                    criteria.andUserIdEqualTo(uf.getUserId());
                    List<EnterpriseInfo> enterpriseInfo=enterpriseInfoMapper.selectByExample(example);
                    if(enterpriseInfo!=null&&enterpriseInfo.size()>0){
                        grabSource.setCarPhone(enterpriseInfo.get(0).getEnterpriseTel());
                    }
                }
            }
            grabSource.setPrice(releaseSource.getExpOffer());
            grabSource.setStartAddress(releaseSource.getStartAddress());
            grabSource.setEndAddress(releaseSource.getArriveAddress());
            grabSource.setGoods(releaseSource.getGoods());
            String weight=releaseSource.getWeight().substring(0,releaseSource.getWeight().indexOf("/"));
            grabSource.setWeight(Double.parseDouble(weight));
            grabSource.setCarBand(carInformation.getCarBrand());
            grabSourceMapper.insert(grabSource);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/transportation/search";
    }

}
