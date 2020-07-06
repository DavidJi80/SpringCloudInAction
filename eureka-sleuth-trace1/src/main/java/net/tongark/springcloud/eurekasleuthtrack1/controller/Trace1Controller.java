package net.tongark.springcloud.eurekasleuthtrack1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
public class Trace1Controller {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-1===");
        return restTemplate.getForEntity("http://SLEUTH-TRACE2/trace-2", String.class).getBody();

    }
}
