package com.cool.service;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * Created by zw on 2017/3/27.
 */
public interface StudentService {


    String printYourName(String name);
}
