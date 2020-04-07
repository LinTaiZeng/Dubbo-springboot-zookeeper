package com.ltz.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ltz.dubbo.api.IUserService;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "Dubbo...Annotation";
    }
}
