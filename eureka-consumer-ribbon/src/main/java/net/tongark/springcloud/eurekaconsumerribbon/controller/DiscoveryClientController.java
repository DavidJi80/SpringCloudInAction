package net.tongark.springcloud.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class DiscoveryClientController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/a_server_info")
    public URI serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("HELLO-SERVICE");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri();
        }
        return null;
    }
}
