package com.gerhard.docker.system.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@FeignClient(value = "system-service")
public interface IHelloSystemClient {

    @GetMapping("/system/hello")
    String hello();
}
