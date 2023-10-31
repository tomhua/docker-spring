package com.gerhard.docker.system.service.impl;

import com.gerhard.docker.system.service.ISystemService;
import org.springframework.stereotype.Service;

/**
 * @Description: @TODO
 * @Author: guanhua
 * @UpdateUser: guanhua
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class SystemServiceImpl implements ISystemService {

    @Override
    public String echoSysInfo() {
        return "This is System infomation line.";
    }
}
