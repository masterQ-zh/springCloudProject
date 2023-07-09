package com.qiaozh.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/19 16:07
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_qiaozh",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now();
        //2022-07-19T18:00:56.632+08:00[Asia/Shanghai]
        System.out.println(time);
    }
}
