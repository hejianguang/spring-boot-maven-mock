package com.cool.service;


import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zw on 2017/3/23.
 */
public class PeopleServiceImpl  implements PeopleService {

    Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);


    @Override
    public String getName(String name) {
        logger.debug("dfs{}", name);
        System.out.print("this is my name he");
        return "he provider"+ name;
    }
}
