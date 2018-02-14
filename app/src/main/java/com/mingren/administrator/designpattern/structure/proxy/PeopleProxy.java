package com.mingren.administrator.designpattern.structure.proxy;

import com.mingren.administrator.designpattern.modle.Chinese;
import com.mingren.administrator.designpattern.modle.People;

/**
 *   静态代理，通过持有固定对象的引用，调用该对象的方法
 */

public class PeopleProxy implements People{

    People people;

    public PeopleProxy() {
        people = new Chinese();
    }


    @Override
    public void say() {
        people.say();
    }
}
