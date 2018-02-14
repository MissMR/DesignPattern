package com.mingren.administrator.designpattern.behavior.object;


/**
 * Created by Administrator on 2017/8/18.
 *  主题角色（被观察者）接口
 */

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyDataSetChanged();
}
