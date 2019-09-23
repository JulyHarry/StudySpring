package com.tutorials.beancollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloWorldCollections {
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public Set getSet() {
        System.out.println(this.set);
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        System.out.println(this.map);
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        System.out.println(this.properties);
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List getList() {
        System.out.println(this.list);
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
