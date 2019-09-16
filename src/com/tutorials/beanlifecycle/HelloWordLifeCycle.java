package com.tutorials.beanlifecycle;

public class HelloWordLifeCycle {
    private String alert;

    private String information;

    private String message;

    public void getAlert() {
        System.out.println("Your Alert is: " + this.alert);
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public void getInformation() {
        System.out.println("Your Information is: " + this.information);
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void getMessage() {
        System.out.println("Your Message is: " + this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Initialize bean!");
    }

    public void destroy() {
        System.out.println("Destroy bean!");
    }

    public void init2() {
        System.out.println("Initialize Local bean!");
    }

    public void destroy2() {
        System.out.println("Destroy Local bean!");
    }

    public void init3() {
        System.out.println("Initialize one bean!");
    }

    public void destroy3() {
        System.out.println("Destroy one bean!");
    }
}
