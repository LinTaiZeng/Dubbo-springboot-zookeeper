package com.ltz.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ltz.dubbo.api.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DubboAnnotationConsumerApplicationTests {

    @Reference
    private IUserService userService;

    @Test
    void contextLoads() {
        String hello = userService.hello();
        System.out.println(hello);
    }

}
