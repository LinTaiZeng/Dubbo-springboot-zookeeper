package com.ltz.dubbo;

import com.ltz.dubbo.api.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DubboConsumerApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void contextLoads() {
        String hello = userService.hello();
        System.out.println(hello);
    }

}
