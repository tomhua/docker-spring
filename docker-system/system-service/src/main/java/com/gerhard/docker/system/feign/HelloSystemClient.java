package com.gerhard.docker.system.feign;

import com.gerhard.docker.system.feign.api.IHelloSystemClient;
import com.gerhard.docker.system.service.ISystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class HelloSystemClient implements IHelloSystemClient {

    @Autowired
    private ISystemService systemService;

    @Override
    public String hello() {
        return "Hello! I'am system model. " + systemService.echoSysInfo();
    }
}
