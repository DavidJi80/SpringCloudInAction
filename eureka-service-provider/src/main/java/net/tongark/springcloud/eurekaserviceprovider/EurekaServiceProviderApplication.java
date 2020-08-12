package net.tongark.springcloud.eurekaserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker   //开启Hystrix断路器功能
public class EurekaServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProviderApplication.class, args);
    }

}
