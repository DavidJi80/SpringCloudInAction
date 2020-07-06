package net.tongark.springcloud.eurekaserverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerProviderApplication.class, args);
    }

}
