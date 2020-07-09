package net.tongark.springcloud.servicehelloapi.service;

import net.tongark.springcloud.servicehelloapi.dto.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface StudentService {

    @RequestMapping(value = "/helloStudent1", method = RequestMethod.GET)
    String helloStudent(@RequestParam("name") String name);

    @RequestMapping(value = "/helloStudent2", method = RequestMethod.GET)
    public Student helloStudent(@RequestParam String name, @RequestParam Integer age);

    @RequestMapping(value = "/helloStudent3", method = RequestMethod.POST)
    public String helloStudent(@RequestBody Student student);

}
