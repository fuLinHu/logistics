package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.CarInformationMapper;
import com.aiwen.logistics.dao.DriverInformationMapper;
import com.aiwen.logistics.dao.SyscodeMapper;
import com.aiwen.logistics.pojo.*;
import com.aiwen.logistics.service.ICarInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 17:35
 */
@Service
public class CarInformationServiceImpl implements ICarInformationService {
    @Autowired
    private CarInformationMapper carInformationMapper;
    @Autowired
    private SyscodeMapper syscodeMapper;
    @Autowired
    private DriverInformationMapper driverInformationMapper;
    @Override
    public List<CarInformation> findByUserId(Integer userId) {
        CarInformationExample carInformationExample = new CarInformationExample();
        CarInformationExample.Criteria criteria = carInformationExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andStatuEqualTo(2);//该状态为审核通过状态
        List<CarInformation> carInformations = carInformationMapper.selectByExample(carInformationExample);
        return carInformations;
    }

    @Override
    public Map<String, Object> findCarInformationById(Integer id) {
        CarInformation carInformation = carInformationMapper.selectByPrimaryKey(id);
        SyscodeExample syscodeExample = new SyscodeExample();
        SyscodeExample.Criteria criteria = syscodeExample.createCriteria();
        criteria.andTypeEqualTo("1");
        if(carInformation.getCarType() != null){
            criteria.andCodeEqualTo(carInformation.getCarType());
        }
        List<Syscode> syscodeList = syscodeMapper.selectByExample(syscodeExample);
        Map<String,Object> map = new HashMap<String,Object>();
        if(syscodeList != null && syscodeList.size() > 0){
            map.put("carTypeName",syscodeList.get(0).getName());
            map.put("carType",syscodeList.get(0).getCode());
        }
        map.put("carLoad",carInformation.getCarLoad());
        map.put("specification",carInformation.getCarLong()+"*"+carInformation.getCarWidth()+"*"+carInformation.getCarHigh());
        return map;
    }

    @Override
    public CarInformation findCarById(Integer carInformationId) {
        return carInformationMapper.selectByPrimaryKey(carInformationId);
    }
    
    @Override
    public List<Map<String, Object>> findCarByStatus(Integer userId) {
        return carInformationMapper.findCarByStatus(userId);
    }

    @Override
    public Map<String, Object> saveCarInformation(CarInformation carInformation) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = carInformationMapper.insertSelective(carInformation);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }
    
    @Override
    public Map<String, Object> saveDriverInformation(DriverInformation driverInformation) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = driverInformationMapper.insertSelective(driverInformation);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }

    @Override
    public Map<String, Object> updateCarInformation(CarInformation carInformation) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = carInformationMapper.updateByPrimaryKeySelective(carInformation);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }
    
    @Override
    public Map<String, Object> updateDriverInformation(DriverInformation driverInformation) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = driverInformationMapper.updateByPrimaryKeySelective(driverInformation);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }

    @Override
    public Map<String, Object> delectCarInformation(Integer delectCarId) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = carInformationMapper.deleteByPrimaryKey(delectCarId);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }
}
