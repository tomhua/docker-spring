package com.gerhard.docker.user.feign;

import com.gerhard.docker.user.feign.api.IHelloUserClient;
import com.gerhard.docker.user.service.IHelloUserService;
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
public class HelloUserClient implements IHelloUserClient {

    @Autowired
    private IHelloUserService helloUserService;

    @Override
    public String hello() {
        return helloUserService.echoUserInfo();
    }
}
