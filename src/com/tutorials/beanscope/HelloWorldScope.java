package com.tutorials.beanscope;

public class HelloWorldScope {
    private String message;

    public void getMessage() {
        System.out.println("Your Message is :"+this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
