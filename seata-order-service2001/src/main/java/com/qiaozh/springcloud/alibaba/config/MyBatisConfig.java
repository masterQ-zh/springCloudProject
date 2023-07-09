package com.qiaozh.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/26 17:40
 */
@Configuration
@MapperScan({"com.qiaozh.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
