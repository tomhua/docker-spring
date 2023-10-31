package com.gerhard.docker.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class GetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetawayApplication.class, args);
        System.out.println("网关中心(gateway)启动成功");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
