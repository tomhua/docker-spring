package com.gerhard.docker.user.service.impl;

import com.gerhard.docker.system.feign.api.IHelloSystemClient;
import com.gerhard.docker.user.service.IHelloUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class HelloUserServiceImpl implements IHelloUserService {

    @Autowired
    private IHelloSystemClient helloSystemClient;

    @Override
    public String echoUserInfo() {
        return "I'am Gerhard.";
    }

    @Override
    public String echoSysInfo() {
        return helloSystemClient.hello();
    }
}
