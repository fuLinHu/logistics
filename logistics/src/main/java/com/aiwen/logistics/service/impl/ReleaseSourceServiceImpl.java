package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.ReleaseSourceMapper;
import com.aiwen.logistics.pojo.Page;
import com.aiwen.logistics.pojo.ReleaseSource;
import com.aiwen.logistics.pojo.ReleaseSourceExample;
import com.aiwen.logistics.service.ReleaseSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2018/4/26.
 */
@Service
public class ReleaseSourceServiceImpl implements ReleaseSourceService {

    @Autowired
    private ReleaseSourceMapper releaseSourceMapper;

    @Override
    public List<ReleaseSource> findReleaseSourceList(ReleaseSourceExample releaseSource) {
        List<ReleaseSource> list=null;
        try {
            list=releaseSourceMapper.selectByExample(releaseSource);
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public int addReleaseSource(ReleaseSource releaseSource) {
        int flag=0;
        try {
            if (releaseSource.getSourceId()!=null){
                if(releaseSource.getOrderState()==3){
                    releaseSource.setOrderState(1);
                }
                if (releaseSource.getOrderState()==5){
                    releaseSource.setOrderState(2);
                }
                releaseSourceMapper.updateByPrimaryKeySelective(releaseSource);
            }else{
                releaseSourceMapper.insertSelective(releaseSource);
            }
            flag=1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public ReleaseSource findById(String id) {
        ReleaseSource releaseSource=null;
        try {
            releaseSource=releaseSourceMapper.selectByPrimaryKey(Integer.parseInt(id));
        }catch (Exception e){
            e.printStackTrace();
        }
        return releaseSource;
    }

    @Override
    public int deleteById(String id) {
        int flag=0;
        try {
            releaseSourceMapper.deleteByPrimaryKey(Integer.parseInt(id));
            flag=1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<ReleaseSource> findReleaseSourceListByUserId(Integer id) {
        return releaseSourceMapper.selectReleaseSourceListByUserId(id);
    }
}
