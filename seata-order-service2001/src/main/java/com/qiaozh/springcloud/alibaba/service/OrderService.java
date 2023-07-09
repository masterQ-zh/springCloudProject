package com.qiaozh.springcloud.alibaba.service;

import com.qiaozh.springcloud.alibaba.domain.Order;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/26 17:34
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
