package com.qiaozh.springcloud.service;

import javax.jws.WebService;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/24 16:21
 */
@WebService
public interface WebServiceAPIService {
    public String getWeatherByCity(String cityName);
}
