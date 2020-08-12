package net.tongark.springcloud.eurakaconsumerfeign.service;

import net.tongark.springcloud.eurakaconsumerfeign.model.User;
import net.tongark.springcloud.servicehelloapi.service.StudentService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//指定服务名来绑定服务
@FeignClient(
        value = "HELLO-SERVICE",    //客户端名称，创建Ribbon或Spring Cloud LoadBalancer负载均衡器
        //url = "",                 //指定URL(绝对值或主机名)
        qualifier = "helloService", //指定别名，默认Bean的名称是接口的完全限定名
        primary = true,             //关闭Primary
        fallback = HelloServiceFallback.class   //Hystrix回退
)
public interface HelloService extends StudentService {
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
