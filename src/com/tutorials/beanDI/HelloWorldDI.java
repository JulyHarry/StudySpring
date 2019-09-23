package com.tutorials.beanDI;


public class HelloWorldDI {
    // Dependency Injection

    private WorldDI worldDI;
    private String name;
    private int num;

    public WorldDI getWorldDI() {
        return worldDI;
    }

    public void setWorldDI(WorldDI worldDI) {
        this.worldDI = worldDI;
    }

    public int getNum() {
        System.out.println(this.num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HelloWorldDI() {
        System.out.println("arg:0 []");
//        System.out.println("HelloWorld message is: " + this.worldDI.getMessage());
    }

    public HelloWorldDI(WorldDI worldDI) {
        System.out.println("arg:1 [WorldDI]");
        System.out.println("message: " + worldDI.getMessage());
//        System.out.println("HelloWorld message is: " + this.worldDI.getMessage());
    }

    public HelloWorldDI(WorldDI worldDI, int num) {
        System.out.println("arg:2 [WorldDI, int]");
        System.out.println("message: " + worldDI.getMessage());
        System.out.println("num: " + num);
//        System.out.println("HelloWorld message is: " + this.worldDI.getMessage());
    }

    public HelloWorldDI(String name, int num, WorldDI worldDI) {
        System.out.println("arg:3 [String, int, WorldDI]");
        System.out.println("name: " + name);
        System.out.println("num: " + num);
        System.out.println("worldDI: " + worldDI.getMessage());
//        System.out.println("HelloWorld message is: " + this.worldDI.getMessage());
    }

    public HelloWorldDI(int num, WorldDI worldDI, String name) {
        System.out.println("arg:3 [int, WorldDI, String]");
        System.out.println("num: " + num);
        System.out.println("worldDI: " + worldDI.getMessage());
        System.out.println("name: " + name);
//        System.out.println("HelloWorld message is: " + this.worldDI.getMessage());
    }

    public void showWorld() {
        System.out.println("This is in showWorld." + this.worldDI.getMessage());
    }

    public void createWorld() {
        System.out.println("Create World.");
        System.out.println("Message: " + this.worldDI.getMessage());
        System.out.println("NO.:" + this.num);
    }
}
