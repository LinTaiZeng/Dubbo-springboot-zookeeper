package com.ltz.dubbo.service.impl;

import com.ltz.dubbo.api.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "SpringBoot...Dubbo";
    }
}
