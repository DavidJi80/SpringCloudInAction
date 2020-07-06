package net.tongark.springcloud.eurakaconsumerfeign.controller;

import net.tongark.springcloud.eurakaconsumerfeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-helloname", method = RequestMethod.GET)
    public String helloConsumer(@RequestParam("name") String name) {
        return helloService.hello(name);
    }
}
