package com.pattern.simplefactory;

public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
