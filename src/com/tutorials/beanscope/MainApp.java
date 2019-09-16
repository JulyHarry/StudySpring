package com.tutorials.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.FileNotFoundException;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        // 单例模式
        ApplicationContext singletoncontext = new ClassPathXmlApplicationContext("BeanSingleton.xml");
        HelloWorld aObj = (HelloWorld) singletoncontext.getBean("helloWorld");
        aObj.getMessage();
        aObj.setMessage("nope");
        aObj.getMessage();
        HelloWorld bObj = (HelloWorld) singletoncontext.getBean("helloWorld");
        bObj.getMessage();

        // 原型模式
        ApplicationContext prototypecontext = new ClassPathXmlApplicationContext("BeanPrototype.xml");
        HelloWorld cObj = (HelloWorld) prototypecontext.getBean("helloWorld");
        cObj.getMessage();
        cObj.setMessage("nope");
        cObj.getMessage();
        HelloWorld dObj = (HelloWorld) prototypecontext.getBean("helloWorld");
        dObj.getMessage();
    }
}
