package net.tongark.springcloud.eurekaconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient  //注册为Eureka客户端应用，获取服务发现能力
@SpringBootApplication
@EnableCircuitBreaker   //开启Hystrix断路器功能
@EnableHystrixDashboard //开启Hystrix仪表盘
public class EurekaConsumerRibbonApplication {

    @Bean           //创建RestTemplate的Spring Bean实例
    @LoadBalanced   //开启客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }

}
