package com.qiaozh.springcloud.service.impl;

import com.qiaozh.springcloud.dao.PaymentDao;
import com.qiaozh.springcloud.entities.Payment;
import com.qiaozh.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/18 16:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
