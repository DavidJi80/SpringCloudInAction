package net.tongark.springcloud.eurakaconsumerfeign.service;

import net.tongark.springcloud.eurakaconsumerfeign.model.User;
import net.tongark.springcloud.servicehelloapi.dto.Student;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }

    @Override
    public String helloStudent(String name) {
        return "error";
    }

    @Override
    public Student helloStudent(String name, Integer age) {
        return new Student("未知",0);
    }

    @Override
    public String helloStudent(Student student) {
        return "error";
    }

}
