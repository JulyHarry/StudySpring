package com.tutorials.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppLifeCycle {
    public static void main(String[] args) {

        // 指定某个bean的初始和回收
        AbstractApplicationContext localContext = new ClassPathXmlApplicationContext("BeanLifeCycleLocal.xml");
        HelloWordLifeCycle localMessage = (HelloWordLifeCycle) localContext.getBean("localMessage");
        localMessage.getMessage();
        HelloWordLifeCycle localInformation = (HelloWordLifeCycle) localContext.getBean("localInformation");
        localInformation.getInformation();
        HelloWordLifeCycle localAlert = (HelloWordLifeCycle) localContext.getBean("localAlert");
        localAlert.getAlert();
        localContext.registerShutdownHook();
        // localMessage->[init,destroy];localInformation->[,];localAlert->[init2,destroy2]
        /*  Results:
            Initialize bean!
            Initialize Local bean!
            Your Message is: Local LifeCycle Message.
            Your Information is: Local LifeCycle Information.
            Your Alert is: Local LifeCycle Alert
            Destroy Local bean!
            Destroy bean!
         */


        // 默认的初始和回收 （加局部的初始和回收）
        AbstractApplicationContext globalContext = new ClassPathXmlApplicationContext("BeanLifeCycleGlobal.xml");
        HelloWordLifeCycle glocbalMessage = (HelloWordLifeCycle) globalContext.getBean("globalMessage");
        glocbalMessage.getMessage();
        HelloWordLifeCycle globalInformation = (HelloWordLifeCycle) globalContext.getBean("globalInformation");
        globalInformation.getInformation();
        HelloWordLifeCycle globalAlert = (HelloWordLifeCycle) globalContext.getBean("globalAlert");
        globalAlert.getAlert();
        globalContext.registerShutdownHook();
        /*  Results:
            Initialize bean!
            Initialize bean!
            Initialize Local bean!
            Your Message is: Global Lifecycle Message.
            Your Information is: Global Lifecycle Information.
            Your Alert is: Global LifeCycle Alert
            Destroy Local bean!
            Destroy bean!
            Destroy bean!
         */

        // 如果上述代码一起运行，则结果为：
        /*  Results:
            Initialize beans!
            Your Message is Local LifeCycle Message.
            Your Message is Local LifeCycle Information.
            Initialize beans!
            Initialize beans!
            Your Message is Global Lifecycle Message.
            Your Message is Global Lifecycle Information.
            Destroy beans!
            Destroy beans!
            Destroy beans!
         */
        // IMPORTANT: Bean的回收都是在程序最后一起进行回收，但是初始化时，相同的一个xml的Bean一起初始化，不同的xml的Bean不同时初始化。

        // 测试执行顺序
        AbstractApplicationContext testRunOrder = new ClassPathXmlApplicationContext("BeanLifeCycleLocal.xml");
        testRunOrder.registerShutdownHook(); // 回收置前
        HelloWordLifeCycle testRunOrderMessage = (HelloWordLifeCycle) testRunOrder.getBean("localMessage");
        testRunOrderMessage.getMessage();
        HelloWordLifeCycle testRunOrderInformation = (HelloWordLifeCycle) testRunOrder.getBean("localInformation");
        testRunOrderInformation.getInformation();
        testRunOrderMessage.setMessage("This is the last program.");
        testRunOrderMessage.getMessage(); // 输出在最后

    }
}
