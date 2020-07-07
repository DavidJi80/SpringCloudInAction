package net.tongark.springcloud.zookeeperconsumer.controller;

import net.tongark.springcloud.zookeeperconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String greeting() {
        return helloService.HelloWorld();
    }
}
