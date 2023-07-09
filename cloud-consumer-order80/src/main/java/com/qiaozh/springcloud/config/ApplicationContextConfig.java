package com.qiaozh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/18 18:24
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced  //负载均衡机制，赋予restTemplate负载均衡的能力(轮询负载方式)
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
