package com.gerhard.docker.user.service;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface IHelloUserService {

    /**
     * 输出用户信息
     * @return
     */
    String echoUserInfo();

    /**
     * 输出系统信息
     * @return
     */
    String echoSysInfo();
}
