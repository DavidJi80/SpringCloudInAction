package net.tongark.springcloud.eurekaserviceprovider.controller;

import net.tongark.springcloud.servicehelloapi.dto.Student;
import net.tongark.springcloud.servicehelloapi.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController implements StudentService {
    @Override
    public String helloStudent(String name) {
        return "Hello Student"+name;
    }

    @Override
    public Student helloStudent(String name, Integer age) {
        return new Student(name,age);
    }

    @Override
    public String helloStudent(Student student) {
        return "Hello Student"+student.getName()+","+student.getAge();
    }
}
