package com.qiaozh.springcloud.service;

import com.qiaozh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/18 16:46
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
