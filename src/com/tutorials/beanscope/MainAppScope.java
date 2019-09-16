package com.tutorials.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class MainAppScope {
    public static void main(String[] args) throws FileNotFoundException {
        // 单例模式 Singleton
        ApplicationContext singletoncontext = new ClassPathXmlApplicationContext("BeanSingleton.xml");
        HelloWorldScope aObj = (HelloWorldScope) singletoncontext.getBean("helloWorld");
        aObj.getMessage();
        aObj.setMessage("Change SingletonMessage as this. Every object created by \'context\' have the same memory.");
        aObj.getMessage();
        HelloWorldScope bObj = (HelloWorldScope) singletoncontext.getBean("helloWorld");
        bObj.getMessage();

        // 原型模式 Prototype
        ApplicationContext prototypecontext = new ClassPathXmlApplicationContext("BeanPrototype.xml");
        HelloWorldScope cObj = (HelloWorldScope) prototypecontext.getBean("helloWorld");
        cObj.getMessage();
        cObj.setMessage("Change PrototypeMessage as this. But you can't see any changes later.");
        cObj.getMessage();
        HelloWorldScope dObj = (HelloWorldScope) prototypecontext.getBean("helloWorld");
        dObj.getMessage();
    }
}
