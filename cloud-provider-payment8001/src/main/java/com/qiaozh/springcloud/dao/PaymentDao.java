package com.qiaozh.springcloud.dao;

import com.qiaozh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/18 16:27
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
