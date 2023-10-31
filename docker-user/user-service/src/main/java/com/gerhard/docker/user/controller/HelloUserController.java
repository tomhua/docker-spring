package com.gerhard.docker.user.controller;

import com.gerhard.docker.user.service.IHelloUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class HelloUserController {

    @Autowired
    private IHelloUserService helloUserService;

    @GetMapping("/echo/sysinfo")
    public String hello(){
        return helloUserService.echoSysInfo();
    }
}
