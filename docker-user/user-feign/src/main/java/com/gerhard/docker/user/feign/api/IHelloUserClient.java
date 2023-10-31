package com.gerhard.docker.user.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@FeignClient(value = "user-service")
public interface IHelloUserClient {

    @GetMapping("/user/hello")
    String hello();
}
