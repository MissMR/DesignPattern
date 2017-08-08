package com.mingren.administrator.designpattern.establish.builder;

import java.io.Serializable;

/**
 *  实体
 */

public class BuilderBean implements Serializable,Cloneable {
    String name;
    String age;
    String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "BuilderBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
