package com.mingren.administrator.designpattern.behavior.command;

import android.util.Log;

/**
 * Created by user on 2018/2/14.
 * 开灯的人
 */

public class TurnLightReceiver implements  Receiver{
    String name;

    public TurnLightReceiver(String name) {
        this.name = name;
    }

    @Override
    public void executeCommand(Command command) {
        Log.e("receiver",name+"执行了一个命令");
        command.execute();
    }
}
