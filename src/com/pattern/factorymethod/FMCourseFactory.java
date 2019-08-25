package com.pattern.factorymethod;

public class FMCourseFactory {
    public ICourseFactory create1(String classname) {
        try {
            if (!(null == classname || "".equals(classname))) {
                return (ICourseFactory) Class.forName(classname).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ICourseFactory create2(Class<? extends ICourseFactory> clazz) throws IllegalAccessException, InstantiationException {
        if (clazz != null) {
            return clazz.newInstance();
        }
        return null;
    }
}
