package com.mingren.administrator.designpattern.behavior.command;

/**
 * Created by user on 2018/2/14.
 * 命令的调用者
 */

public class Invoker {

    public void execute(Receiver receiver,Command command){
        receiver.executeCommand(command);
    }

}
