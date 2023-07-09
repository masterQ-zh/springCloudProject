package com.qiaozh.springcloud.alibaba.controller;

import com.qiaozh.springcloud.alibaba.domain.CommonResult;
import com.qiaozh.springcloud.alibaba.domain.Order;
import com.qiaozh.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/26 17:39
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}

