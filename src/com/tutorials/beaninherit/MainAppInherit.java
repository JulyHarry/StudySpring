package com.tutorials.beaninherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppInherit {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanInherit.xml");
        HelloWorldInherit hw = (HelloWorldInherit) context.getBean("helloWorld");
        hw.getMessage1();
        hw.getMessage2();
        HelloUniverseInherit hu = (HelloUniverseInherit) context.getBean("helloUniverse");
        hu.getMessage1();
        hu.getMessage2();
        hu.getMessage3();
        /*
        World Message1 : Hello World!
        World Message2 : Hello Second World!
        Universe Message1 : Hello Universe!
        Universe Message2 : Hello Second World!
        Universe Message3 : I love you Universe!
         */

        ApplicationContext context1 = new ClassPathXmlApplicationContext("BeanInheritTemplate.xml");
        HelloUniverseInherit hu1 = (HelloUniverseInherit) context1.getBean("helloUniverse");
        hu1.getMessage1();
        hu1.getMessage2();
        hu1.getMessage3();
        /*
        Universe Message1 : Hello Universe! Template
        Universe Message2 : null
        Universe Message3 : I love you Universe! Template
         */
    }
}
