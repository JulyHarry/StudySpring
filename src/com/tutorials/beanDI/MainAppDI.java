package com.tutorials.beanDI;

import com.tutorials.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanDI.xml");
        HelloWorldDI  hw1 = (HelloWorldDI) context.getBean("helloWorldDI2");
        hw1.showWorld();
        HelloWorldDI  hw2 = (HelloWorldDI) context.getBean("create1");
        hw2.createWorld();
        HelloWorldDI  hw3 = (HelloWorldDI) context.getBean("create2");
        hw3.createWorld();
        HelloWorldDI  hw4 = (HelloWorldDI) context.getBean("create3");
        hw4.createWorld();
    }
}
