package com.ltz.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboAnnotationProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboAnnotationProductApplication.class, args);
    }

}
