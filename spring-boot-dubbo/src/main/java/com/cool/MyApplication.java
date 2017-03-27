package com.cool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by zw on 2017/3/24.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableAsync
@ImportResource({"classpath:provider.xml"})
public class MyApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(MyApplication.class, args);
    }
}
