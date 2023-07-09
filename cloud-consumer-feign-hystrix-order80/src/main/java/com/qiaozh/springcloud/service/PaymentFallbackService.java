package com.qiaozh.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/18 17:47
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fallback paymentInfo_ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fallback paymentInfo_TimeOut";
    }
}
