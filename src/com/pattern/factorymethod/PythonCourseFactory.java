package com.pattern.factorymethod;

import com.pattern.simplefactory.ICourse;
import com.pattern.simplefactory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
