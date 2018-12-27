package com.aiwen.logistics.service;

import com.aiwen.logistics.pojo.Complain;
import com.aiwen.logistics.pojo.Evaluation;
import com.aiwen.logistics.pojo.OrderRelease;

import java.util.List;
import java.util.Map;

/**
 * @Author: 董传斌
 * @Date: 2018/4/28 8:58
 */
public interface IOrderService {
    List<Map<String,Object>> findAllOrder(Integer pageNo, Integer startRow);
    public List<OrderRelease>  getOrderList(OrderRelease orderRelease);
    public OrderRelease  selectByPrimaryKey(Integer id);
    public int  updateOrderRelease(OrderRelease orderRelease);
    Map<String,Object> saveOrderEvaluation(Evaluation evaluation);
    Map<String,Object> saveOrderComplain(Complain complain);

}