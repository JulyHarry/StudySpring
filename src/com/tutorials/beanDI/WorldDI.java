package com.tutorials.beanDI;

public class WorldDI {
    private String message;

    public String getMessage() {
        System.out.println("World DI message is: "+this.message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
