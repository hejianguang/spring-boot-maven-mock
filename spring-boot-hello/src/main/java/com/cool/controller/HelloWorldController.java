package com.cool.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cool.service.PeopleService;
import com.cool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zw on 2017/3/23.
 */

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ImportResource("classpath:consumer.xml")
public class HelloWorldController implements EmbeddedServletContainerCustomizer{

    @Autowired
    private PeopleService peopleService;
    @Autowired
    private StudentService studentService;
    @RequestMapping("/")
    @ResponseBody
    String home() {
        String name = "he";
        String result = peopleService.getName(name);
        String studentName = studentService.printYourName(name);
        return "Hello World! My name is he!" + result + "sss---" + studentName;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8081);
    }
}
