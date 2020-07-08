package net.tongark.springcloud.eurakaconsumerfeign.controller;

import net.tongark.springcloud.eurakaconsumerfeign.model.User;
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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloService.hello();
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name) {
        return helloService.hello(name);
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestParam String name, @RequestParam Integer age){
        return helloService.hello(name,age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello3(){
        return helloService.hello(new User("jdhsh",78));
    }
}
