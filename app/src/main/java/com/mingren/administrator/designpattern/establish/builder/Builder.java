package com.mingren.administrator.designpattern.establish.builder;


/**
 * 用来创建BuilderBean的建造者
 */
public class Builder {
   private  String name ="";
   private  String age = "";
   private  String tel = "";

    public  Builder setName(String name){
        this.name = name;
        return  this;
    }

    public  Builder setAge(String age){
        this.age = age;
        return  this;
    }

    public  Builder setTel(String tel){
        this.tel = tel;
        return  this;
    }

    public BuilderBean creat(){
        BuilderBean bean = new BuilderBean();
        if (!name.isEmpty()){
            bean.setName(name);
            name = "";
        }

        if (!age.isEmpty()){
            bean.setAge(age);
            age = "";
        }

        if (!tel.isEmpty()){
            bean.setTel(tel);
            tel = "";
        }

        return  bean;
    }
}
