package net.tongark.springcloud.eurakaconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "HELLO-SERVICE")
public interface HelloService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

}
