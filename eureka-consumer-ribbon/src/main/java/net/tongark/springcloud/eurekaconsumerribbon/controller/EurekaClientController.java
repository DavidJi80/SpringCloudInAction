package net.tongark.springcloud.eurekaconsumerribbon.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient discoveryClient;

    @GetMapping("/server_info")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("HELLO-SERVICE", false);
        return instance.getHomePageUrl();
    }
}
