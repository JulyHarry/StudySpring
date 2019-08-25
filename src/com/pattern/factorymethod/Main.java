package com.pattern.factorymethod;

import com.pattern.simplefactory.ICourse;

public class Main {
    public static void main(String[] args) {
        FMCourseFactory fmCourseFactory = new FMCourseFactory();
        try {
            ICourseFactory iCourseFactory = fmCourseFactory.create1("com.pattern.factorymethod.JavaCourseFactory");
            ICourse iCourse = iCourseFactory.create();
            iCourse.record();
        } catch (Exception e) {
            e.printStackTrace();
        }

        fmCourseFactory = new FMCourseFactory();
        try {
            ICourseFactory iCourseFactory = fmCourseFactory.create2(PythonCourseFactory.class);
            ICourse iCourse = iCourseFactory.create();
            iCourse.record();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
