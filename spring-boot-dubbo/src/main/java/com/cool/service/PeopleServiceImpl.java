package com.cool.service;


import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zw on 2017/3/23.
 */
public class PeopleServiceImpl  implements PeopleService {

    static Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);


    private int a = 1100;
    private int b = 1100;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String getName(String name) {
        logger.debug("dfs{}", name);
        System.out.print("this is my name he" + name);
        return "he provider"+ name;
    }
}
