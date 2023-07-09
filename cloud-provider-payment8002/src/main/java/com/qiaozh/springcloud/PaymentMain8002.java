package com.qiaozh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/18 16:04
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
        //发布服务;参数1：服务地址   参数2：服务实现类
//        Endpoint.publish("http://localhost:8756/weatherService",new WebServiceAPIServiceImpl());
    }
}
