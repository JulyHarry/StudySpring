package com.tutorials.beancollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppCollections {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanCollections.xml");
        HelloWorldCollections helloWorldCollections = (HelloWorldCollections) context.getBean("helloWorldCollections");
        helloWorldCollections.getList();
        helloWorldCollections.getSet();
        helloWorldCollections.getMap();
        helloWorldCollections.getProperties();
    }
}
