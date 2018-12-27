package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.AreaInfoMapper;
import com.aiwen.logistics.pojo.AreaInfo;
import com.aiwen.logistics.pojo.AreaInfoExample;
import com.aiwen.logistics.service.IAreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 18:00
 */
@Service
public class AreaInfoServiceImpl implements IAreaInfoService {

    @Autowired
    private AreaInfoMapper areaInfoMapper;

    /**
     * 查询所有省份
     * @return
     */
    @Override
    public List<AreaInfo> findProvince() {
        List<AreaInfo> areaInfos = areaInfoMapper.findProvince();
        return areaInfos;
    }

    /**
     * 根据省份的id查询下属城市
     * @param province
     * @return
     */
    @Override
    public List<AreaInfo> findByProvince(String province) {
        AreaInfo areaInfo = areaInfoMapper.selectByPrimaryKey(Integer.parseInt(province));
        List<AreaInfo> areaInfos = null;
        if(areaInfo != null){
            AreaInfoExample areaInfoExample = new AreaInfoExample();
            AreaInfoExample.Criteria criteria = areaInfoExample.createCriteria();
            criteria.andFcodeEqualTo(areaInfo.getCode());
            areaInfos = areaInfoMapper.selectByExample(areaInfoExample);
        }
        return areaInfos;
    }

    /**
     * 根据城市的id查询下属区县
     * @param city
     * @return
     */
    @Override
    public List<AreaInfo> findByCity(String city) {
        AreaInfo areaInfo = areaInfoMapper.selectByPrimaryKey(Integer.parseInt(city));
        List<AreaInfo> areas = null;
        if(areaInfo != null){
            AreaInfoExample areaInfoExample = new AreaInfoExample();
            AreaInfoExample.Criteria criteria = areaInfoExample.createCriteria();
            criteria.andFcodeEqualTo(areaInfo.getCode());
            areas = areaInfoMapper.selectByExample(areaInfoExample);
        }
        return areas;
    }

    @Override
    public AreaInfo findById(Integer id) {
        return areaInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AreaInfo> findBelonged(String AreaInfoId) {
        AreaInfo areaInfo = areaInfoMapper.selectByPrimaryKey(Integer.parseInt(AreaInfoId));
        AreaInfoExample areaInfoExample = new AreaInfoExample();
        AreaInfoExample.Criteria criteria = areaInfoExample.createCriteria();
        criteria.andFcodeEqualTo(areaInfo.getCode());
        List<AreaInfo> areaInfos = areaInfoMapper.selectByExample(areaInfoExample);
        return areaInfos;
    }


}
