package net.tongark.springcloud.eurakaconsumerfeign.controller;

import net.tongark.springcloud.eurakaconsumerfeign.service.HelloService;
import net.tongark.springcloud.servicehelloapi.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/helloStudent1", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name) {
        return helloService.helloStudent(name);
    }

    @RequestMapping(value = "/helloStudent2", method = RequestMethod.GET)
    public Student hello(@RequestParam String name, @RequestParam Integer age){
        return helloService.helloStudent(name,age);
    }

    @RequestMapping(value = "/helloStudent3", method = RequestMethod.GET)
    public String hello3(){
        return helloService.helloStudent(new Student("jdhsh",78));
    }
}
