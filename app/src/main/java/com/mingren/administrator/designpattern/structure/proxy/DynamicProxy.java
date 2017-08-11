package com.mingren.administrator.designpattern.structure.proxy;

import com.mingren.administrator.designpattern.modle.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  动态代理
 */
public class DynamicProxy implements InvocationHandler {
    People people;

    public DynamicProxy(People people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(people,objects);
    }
}
