package com.pattern.simplefactory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Python");
    }
}
