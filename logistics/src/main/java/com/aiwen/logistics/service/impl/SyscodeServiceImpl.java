package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.SyscodeMapper;
import com.aiwen.logistics.pojo.Syscode;
import com.aiwen.logistics.pojo.SyscodeExample;
import com.aiwen.logistics.service.ISyscodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 董传斌
 * @Date: 2018/5/3 17:43
 */
@Service
public class SyscodeServiceImpl implements ISyscodeService {
    @Autowired
    private SyscodeMapper syscodeMapper;
    @Override
    public List<Syscode> findAllByType(String type) {
        SyscodeExample syscodeExample = new SyscodeExample();
        SyscodeExample.Criteria criteria = syscodeExample.createCriteria();
        criteria.andTypeEqualTo(type);
        List<Syscode> syscodeList = syscodeMapper.selectByExample(syscodeExample);
        return syscodeList;
    }
}
