package com.qiaozh.springcloud.alibaba.service;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/26 18:13
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
