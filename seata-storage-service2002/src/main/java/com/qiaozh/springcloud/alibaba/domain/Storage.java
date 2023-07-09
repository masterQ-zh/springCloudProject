package com.qiaozh.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/26 18:11
 */
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
