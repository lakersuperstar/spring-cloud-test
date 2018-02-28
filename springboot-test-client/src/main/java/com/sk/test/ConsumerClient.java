package com.sk.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/2/9.
 */
@FeignClient("springboot-test-server")
public interface ConsumerClient {


    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();

}
