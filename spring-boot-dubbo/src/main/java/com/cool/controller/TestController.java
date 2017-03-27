package com.cool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zw on 2017/3/24.
 */
@Controller
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.debug("werwrwerewrwrew12321313---------");
        return "Hello World! My name is he123!";
    }
}
