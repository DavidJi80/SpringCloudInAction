package net.tongark.springcloud.eurakaconsumerfeign.service;

import net.tongark.springcloud.eurakaconsumerfeign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "HELLO-SERVICE")   //指定服务名来绑定服务
public interface HelloService {
    //使用Spring MVC注释来绑定具体该服务提供的REST接口
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestParam String name, @RequestParam Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello(@RequestBody User user);

}
