package com.tutorials.beanscope;

import com.tutorials.beanscope.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        // 单例模式 Singleton
        ApplicationContext singletoncontext = new ClassPathXmlApplicationContext("BeanSingleton.xml");
        HelloWorld aObj = (HelloWorld) singletoncontext.getBean("helloWorld");
        aObj.getMessage();
        aObj.setMessage("Change SingletonMessage as this. Every object created by \'context\' have the same memory.");
        aObj.getMessage();
        HelloWorld bObj = (HelloWorld) singletoncontext.getBean("helloWorld");
        bObj.getMessage();

        // 原型模式 Prototype
        ApplicationContext prototypecontext = new ClassPathXmlApplicationContext("BeanPrototype.xml");
        HelloWorld cObj = (HelloWorld) prototypecontext.getBean("helloWorld");
        cObj.getMessage();
        cObj.setMessage("Change PrototypeMessage as this. But you can't see any changes later.");
        cObj.getMessage();
        HelloWorld dObj = (HelloWorld) prototypecontext.getBean("helloWorld");
        dObj.getMessage();
    }
}
