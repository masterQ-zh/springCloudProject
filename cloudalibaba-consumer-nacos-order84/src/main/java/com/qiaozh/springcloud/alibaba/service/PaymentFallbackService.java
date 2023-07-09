package com.qiaozh.springcloud.alibaba.service;

import com.qiaozh.springcloud.entities.CommonResult;
import com.qiaozh.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/26 11:26
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
