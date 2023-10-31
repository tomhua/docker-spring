package com.gerhard.docker.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaApplication.class, args);
        System.out.println("注册中心(eureka)启动成功,请启动配制中心(config)");
    }
}
