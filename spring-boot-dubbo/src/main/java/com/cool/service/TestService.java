package com.cool.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by zw on 2017/3/28.
 */
public class TestService {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> obj = Class.forName("com.cool.service.PeopleServiceImpl");
        Class<?> interfaces[] = obj.getInterfaces();//获得Dog所实现的所有接口
        for (Class<?> inte : interfaces) {//打印
            System.out.println("Dog实现接口："+inte);
        }
        //get
        Method[] methods = obj.getDeclaredMethods();
        for (Method method: methods){
            System.out.println(method.getName());
            if (method.getName().equals("getName")){
                method.invoke(obj.newInstance(), "myName");
            }

        }
        int aaa = obj.getModifiers();
        System.out.println(aaa);

        Field[] fields = obj.getDeclaredFields();
        for (Field field: fields){
            System.out.println(Modifier.toString(field.getModifiers())+ field.getName());
        }
    }
}
