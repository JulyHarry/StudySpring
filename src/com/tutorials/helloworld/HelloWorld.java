package com.tutorials.helloworld;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("HelloWorld message is :" + this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
