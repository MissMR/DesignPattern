package com.mingren.administrator.designpattern.structure.decorator;

import android.util.Log;

import com.mingren.administrator.designpattern.modle.People;

/**
 * People的装饰类
 * 与被装饰类实现同一接口
 * 持有委托对象的引用
 * 用于扩展功能
 */
public class PeopleDecorator implements People{

    People people = null;

    public PeopleDecorator(People people) {
        this.people = people;
    }


    @Override
    public void say() {
        people.say();
        Log.e("say","我是装饰类");
    }
}
