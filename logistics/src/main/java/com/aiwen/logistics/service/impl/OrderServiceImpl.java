package com.aiwen.logistics.service.impl;

import com.aiwen.logistics.dao.ComplainMapper;
import com.aiwen.logistics.dao.EvaluationMapper;
import com.aiwen.logistics.dao.OrderReleaseMapper;
import com.aiwen.logistics.pojo.Complain;
import com.aiwen.logistics.pojo.Evaluation;
import com.aiwen.logistics.pojo.OrderRelease;
import com.aiwen.logistics.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/4/28 8:59
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderReleaseMapper orderReleaseMapper;
    @Autowired
    private EvaluationMapper evaluationMapper;
    @Autowired
    private ComplainMapper complainMapper;
    @Override
    public List<Map<String, Object>> findAllOrder(Integer pageNo, Integer startRow) {
        return null;
    }

    @Override
    public List<OrderRelease> getOrderList(OrderRelease orderRelease) {
        return orderReleaseMapper.getOrderList(orderRelease);
    }

    @Override
    public OrderRelease selectByPrimaryKey(Integer id) {
        return orderReleaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateOrderRelease(OrderRelease orderRelease) {
        return orderReleaseMapper.updateByPrimaryKey(orderRelease);
    }

    @Override
    public Map<String, Object> saveOrderEvaluation(Evaluation evaluation) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = evaluationMapper.insertSelective(evaluation);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }

    @Override
    public Map<String, Object> saveOrderComplain(Complain complain) {
        Map<String, Object> map = new HashMap<String,Object>();
        int res = complainMapper.insertSelective(complain);
        if(res > 0){
            map.put("res",res);
        }
        return map;
    }

}
