package com.mingren.administrator.designpattern.behavior.command;

/**
 * Created by user on 2018/2/14.
 * 执行人角色
 */

public interface Receiver {
    void executeCommand(Command command);
}
