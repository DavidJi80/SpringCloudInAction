package net.tongark.springcloud.zookeeperconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "hello-service")
public interface HelloService {
    @RequestMapping(path = "/helloworld", method = RequestMethod.GET)
    @ResponseBody
    String HelloWorld();
}
