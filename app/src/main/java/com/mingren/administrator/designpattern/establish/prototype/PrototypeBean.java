package com.mingren.administrator.designpattern.establish.prototype;

import com.mingren.administrator.designpattern.establish.builder.BuilderBean;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式实体类
 */

public class PrototypeBean implements Cloneable ,Serializable{
    public PrototypeBean(String name, String age, String tel, BuilderBean builderBean) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.builderBean = builderBean;
    }

    String name,age,tel;
    BuilderBean builderBean;



    /**
     *  浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected PrototypeBean clone() throws CloneNotSupportedException {
        PrototypeBean bean = (PrototypeBean) super.clone();
        return bean;
    }


    /**
     *  深复制
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public PrototypeBean deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (PrototypeBean) ois.readObject();
    }


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

    public BuilderBean getBuilderBean() {
        return builderBean;
    }

    public void setBuilderBean(BuilderBean builderBean) {
        this.builderBean = builderBean;
    }

    @Override
    public String toString() {
        return "PrototypeBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", tel='" + tel + '\'' +
                ", builderBean=" + builderBean +
                '}';
    }
}
