package com.mingren.administrator.designpattern.structure.proxy;

import android.util.Log;

import com.mingren.administrator.designpattern.modle.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  动态代理
 */
public class DynamicProxy implements InvocationHandler {
    Object people;

    public DynamicProxy(Object people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Log.e("动态代理","start");
        people = method.invoke(people,objects);
        Log.e("动态代理","end");
        return people;
    }
}
