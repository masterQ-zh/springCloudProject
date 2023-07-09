package com.qiaozh.springcloud.service.impl;

import com.qiaozh.springcloud.service.WebServiceAPIService;

import javax.jws.WebService;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/5/24 16:22
 */
@WebService
public class WebServiceAPIServiceImpl implements WebServiceAPIService {
    @Override
    public String getWeatherByCity(String cityName) {
        return "天气不好";
    }
}
