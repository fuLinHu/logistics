package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.*;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.ITransportationService;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/4/25 17:45
 */
@Service
public class TransportationServiceImpl implements ITransportationService {
    @Autowired
    private CarInformationMapper carInformationMapper;
    @Autowired
    private LandTransportationMapper landTransportationMapper;
    @Autowired
    private AreaInfoMapper areaInfoMapper;
    @Autowired
    private OceanCarriageInformationMapper oceanCarriageInformationMapper;
    @Autowired
    private UserFrontMapper userFrontMapper;
    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;
    @Autowired
    private GrabSourceMapper grabSourceMapper;


    @Override
    public List<Map<String,Object>> findTransportationByStatusV(Integer status, String accountType, Integer userId, Integer identityType) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("status",status);
        map.put("accountType",accountType);
        map.put("userId",userId);
        map.put("identityType",identityType);
        List<Map<String,Object>> landTransportationList = landTransportationMapper.selectByStatus(map);
        return landTransportationList;
    }

    @Override
    public List<Map<String, Object>> findTransportationByStatusT(UserFront userFront,Integer status,String carType,Double carLong, Double carLoad, Integer startRow, Integer endRow) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("status",status);
        if(!"0".equals(carType)){
            map.put("carType",carType);
        }
        map.put("carLong",carLong);
        map.put("carLoad",carLoad);
        map.put("startRow",startRow);
        map.put("endRow",endRow);
        List<Map<String,Object>> landTransportationList =  landTransportationMapper.findTransportationByStatus(map);
        if(landTransportationList!=null&&landTransportationList.size()>0){
            for(Map<String,Object> map1:landTransportationList){
                String tel= (String) map1.get("tel");
                if(tel==null||"".equals(tel)){
                    LandTransportation landTransportation=landTransportationMapper.selectByPrimaryKey((Integer) map1.get("id"));
                    CarInformation carInformation=carInformationMapper.selectByPrimaryKey(landTransportation.getCarInformationId());
                    if(!"".equals(carInformation.getUserId())&&carInformation.getUserId()!=null){
                        UserFront uf=userFrontMapper.selectByPrimaryKey(carInformation.getUserId());
                        if(uf!=null&&uf.getIdentityType()==2){//企业
                            EnterpriseInfoExample example=new EnterpriseInfoExample();
                            EnterpriseInfoExample.Criteria criteria=example.createCriteria();
                            criteria.andUserIdEqualTo(uf.getUserId());
                            List<EnterpriseInfo> enterpriseInfo=enterpriseInfoMapper.selectByExample(example);
                            if(enterpriseInfo!=null&&enterpriseInfo.size()>0){
                                map1.put("tel",enterpriseInfo.get(0).getEnterpriseTel());
                            }
                        }
                    }
                }
                if(userFront!=null){
                    GrabSourceExample example=new GrabSourceExample();
                    GrabSourceExample.Criteria criteria=example.createCriteria();
                    criteria.andTransportIdEqualTo((Integer) map1.get("id"));
                    criteria.andUserIdEqualTo(userFront.getUserId());
                    List<GrabSource> list=grabSourceMapper.selectByExample(example);
                    if(list!=null&&list.size()>0){
                        map1.put("flag",1);
                    }
                }
            }
        }
        return landTransportationList;
    }

    @Override
    public Map<String, Object> saveTransportationAndCar(HttpServletRequest request, LandTransportation transportation, CarInformation carInformation) {
        int result = 0;
        Map<String, Object> map = new HashMap<String,Object>();
        if(carInformation.getCarType() != "0"){
            UserFront userFront = (UserFront)request.getSession().getAttribute("userFront");
            transportation.setCarInformationId(carInformation.getId());
            CarInformation carInformation1 = carInformationMapper.selectByPrimaryKey(carInformation.getId());
            transportation.setCarBrand(carInformation1.getCarBrand());
            transportation.setUserName(userFront.getUserName());
//            transportation.setUserName("宝莱特");//方便测试
            //把省市区县拼装成自段
            //起始地
            AreaInfoExample areaInfoExample1 = new AreaInfoExample();
            AreaInfoExample.Criteria criteria1 = areaInfoExample1.createCriteria();
            List<Integer> listDeparture = new ArrayList<Integer>();
            listDeparture.add(Integer.parseInt(transportation.getDepartureProvince()));
            listDeparture.add(Integer.parseInt(transportation.getDepartureCity()));
            listDeparture.add(Integer.parseInt(transportation.getDepartureArea()));
            criteria1.andIdIn(listDeparture);
            List<AreaInfo> areaInfos = areaInfoMapper.selectByExample(areaInfoExample1);
            StringBuffer departure = new StringBuffer();
            if(areaInfos != null && areaInfos.size() > 0){
                for (AreaInfo areaInfo1 : areaInfos){
                    departure.append(areaInfo1.getAreaname());
                }
            }
            if(departure != null){
                transportation.setDeparture(departure.toString());
            }
            //目的地
            AreaInfoExample areaInfoExample2 = new AreaInfoExample();
            AreaInfoExample.Criteria criteria2 = areaInfoExample2.createCriteria();
            List<Integer> listDestination = new ArrayList<Integer>();
            listDestination.add(Integer.parseInt(transportation.getDestinationProvince()));
            listDestination.add(Integer.parseInt(transportation.getDestinationCity()));
            listDestination.add(Integer.parseInt(transportation.getDestinationArea()));
            criteria2.andIdIn(listDestination);
            List<AreaInfo> areaInfoss = areaInfoMapper.selectByExample(areaInfoExample2);
            StringBuffer destination = new StringBuffer();
            if(areaInfoss != null && areaInfoss.size() > 0){
                for (AreaInfo areaInfo1 : areaInfoss){
                    destination.append(areaInfo1.getAreaname());
                }
            }
            if(destination != null){
                transportation.setDestination(destination.toString());
            }
            //发布运力，未上线
            transportation.setStatus(3);
            transportation.setId(null);
            result = landTransportationMapper.insertSelective(transportation);
            if(result > 0){
//                carInformation1.setStatus(2);
                carInformationMapper.updateByPrimaryKeySelective(carInformation1);//车辆与车源信息绑定后修改其状态为已发布运力
                map.put("result",result);
            }
        } else {
            map.put("result","参数异常");
        }
        return map;
    }

    @Override
    public Map<String, Object> delectTransportation(Integer delectId) {
        LandTransportation landTransportation = landTransportationMapper.selectByPrimaryKey(delectId);
        CarInformation carInformation = carInformationMapper.selectByPrimaryKey(landTransportation.getCarInformationId());
//        carInformation.setStatus(1);
        int result = carInformationMapper.updateByPrimaryKeySelective(carInformation);
        result += landTransportationMapper.deleteByPrimaryKey(landTransportation.getId());
        Map<String,Object> map = new HashMap<String,Object>();
        if(result == 2){
            map.put("result",result);
        }
        return map;
    }

    @Override
    public Map<String, Object> relineTransportation(Integer relineId) {
        LandTransportation landTransportation = new LandTransportation();
        landTransportation.setId(relineId);
        landTransportation.setStatus(1);
        int res = landTransportationMapper.updateByPrimaryKeySelective(landTransportation);
        Map<String,Object> map = new HashMap<String,Object>();
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }

    @Override
    public Map<String, Object> golineTransportation(Integer golineId) {
        LandTransportation landTransportation = new LandTransportation();
        landTransportation.setId(golineId);
        landTransportation.setStatus(1);
        int res = landTransportationMapper.updateByPrimaryKeySelective(landTransportation);
        Map<String,Object> map = new HashMap<String,Object>();
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }

    @Override
    public LandTransportation findTransportationById(Integer updateId) {
        return landTransportationMapper.selectByPrimaryKey(updateId);
    }

    @Override
    public OceanCarriageInformation findOceanTransportationById(Integer updateId) {
        return oceanCarriageInformationMapper.selectByPrimaryKey(updateId);
    }

    @Override
    public Map<String, Object> updateTransportation(HttpServletRequest request, LandTransportation transportation ,CarInformation carInformation) {
        int result = 0;
        Map<String, Object> map = new HashMap<String,Object>();
        if(carInformation.getCarType() != "0"){
            //把省市区县拼装成自段
            //起始地
            AreaInfoExample areaInfoExample1 = new AreaInfoExample();
            AreaInfoExample.Criteria criteria1 = areaInfoExample1.createCriteria();
            List<Integer> listDeparture = new ArrayList<Integer>();
            listDeparture.add(Integer.parseInt(transportation.getDepartureProvince()));
            listDeparture.add(Integer.parseInt(transportation.getDepartureCity()));
            listDeparture.add(Integer.parseInt(transportation.getDepartureArea()));
            criteria1.andIdIn(listDeparture);
            List<AreaInfo> areaInfos = areaInfoMapper.selectByExample(areaInfoExample1);
            StringBuffer departure = new StringBuffer();
            if(areaInfos != null && areaInfos.size() > 0){
                for (AreaInfo areaInfo1 : areaInfos){
                    departure.append(areaInfo1.getAreaname());
                }
            }
            if(departure != null){
                transportation.setDeparture(departure.toString());
            }
            //目的地
            AreaInfoExample areaInfoExample2 = new AreaInfoExample();
            AreaInfoExample.Criteria criteria2 = areaInfoExample2.createCriteria();
            List<Integer> listDestination = new ArrayList<Integer>();
            listDestination.add(Integer.parseInt(transportation.getDestinationProvince()));
            listDestination.add(Integer.parseInt(transportation.getDestinationCity()));
            listDestination.add(Integer.parseInt(transportation.getDestinationArea()));
            criteria2.andIdIn(listDestination);
            List<AreaInfo> areaInfoss = areaInfoMapper.selectByExample(areaInfoExample2);
            StringBuffer destination = new StringBuffer();
            if(areaInfoss != null && areaInfoss.size() > 0){
                for (AreaInfo areaInfo1 : areaInfoss){
                    destination.append(areaInfo1.getAreaname());
                }
            }
            if(destination != null){
                transportation.setDestination(destination.toString());
            }

            result = landTransportationMapper.updateByPrimaryKeySelective(transportation);
            if(result > 0){
                map.put("result",result);
            }
        } else {
            map.put("result","参数异常");
        }
        return map;
    }

    @Override
    public Integer countAll(Integer status, String carType, Double carLong, Double carLoad) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("status",status);
        if(!"0".equals(carType)){
            map.put("carType",carType);
        }
        map.put("carLong",carLong);
        map.put("carLoad",carLoad);
        return landTransportationMapper.countAllByCondition(map);
    }


}
