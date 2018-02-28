package com.sk.test;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/2/8.
 */
@Controller
public class ComputeController {


    private static Logger LOGGER = LoggerFactory.getLogger(ComputeController.class);


    @Autowired
    private DiscoveryClient client;



    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {


        ServiceInstance instance = client.getLocalServiceInstance();

        String temp = "当前时间【" + df.format(new Date()) + "】/add, host:" + instance.getHost() + ", service_id:"
                + instance.getServiceId();

        LOGGER.info(temp);

        return temp;

    }

}
