package com.qiaozh.springcloud.controller;

import com.qiaozh.springcloud.entities.CommonResult;
import com.qiaozh.springcloud.entities.Payment;
import com.qiaozh.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/13 17:06
 */
@RestController
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/cunsumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //open-feign-ribbon,客户端一版默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
