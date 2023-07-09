package com.qiaozh.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qiaozh.springcloud.entities.CommonResult;

/**
 * @author qiaozh
 * @version 1.0
 * @date 2022/7/25 22:07
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(4444,"自定义的限流处理信息......CustomerBlockHandler1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(4444,"自定义的限流处理信息......CustomerBlockHandler2");
    }
}
