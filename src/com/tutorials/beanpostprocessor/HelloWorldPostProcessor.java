package com.tutorials.beanpostprocessor;

public class HelloWorldPostProcessor {
    public String message;

    public void getMessage() {
        System.out.println("Your message is: " + this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Initialize Bean.");
    }

    public void destroy() {
        System.out.println("Destroy Bean.");
    }
}
