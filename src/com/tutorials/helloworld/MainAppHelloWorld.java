package com.tutorials.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppHelloWorld {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanHelloWorld.xml");
        // getBean() 的String填的是Beans里的Bean的name/id
        HelloWorld helloWorld1 = (HelloWorld) context.getBean("worldid"); // use Bean id
        helloWorld1.getMessage();
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("worldname"); // use Bean name
        helloWorld2.getMessage();
    }
}
