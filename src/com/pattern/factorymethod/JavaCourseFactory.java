package com.pattern.factorymethod;

import com.pattern.simplefactory.ICourse;
import com.pattern.simplefactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
