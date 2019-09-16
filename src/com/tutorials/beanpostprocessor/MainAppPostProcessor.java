package com.tutorials.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppPostProcessor {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");
        HelloWorldPostProcessor h = (HelloWorldPostProcessor) context.getBean("helloPostProcessor");
        h.getMessage();
        context.registerShutdownHook();
    }
}
