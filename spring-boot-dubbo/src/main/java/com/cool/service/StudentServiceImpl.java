package com.cool.service;

import org.springframework.stereotype.Service;

/**
 * Created by zw on 2017/3/27.
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public String printYourName(String name) {
        return "my name is " + name + "in provider";
    }
}
