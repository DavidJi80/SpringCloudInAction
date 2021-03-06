package net.tongark.springcloud.eurekaconsumerribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class HelloService {
    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand是由一个名为“javanica”的Netflix库提供的。
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloFallback", commandKey = "helloKey")
    public String helloService() {
        long start = System.currentTimeMillis();
        String result = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody().toString();
        long end = System.currentTimeMillis();
        long spendTime = end - start;
        logger.info("Spend time:" + spendTime);
        return result + "! Spend Time: " + spendTime;
    }

    public String helloFallback() {
        return "hi,sorry,error!";
    }

}
