package com.mingren.administrator.designpattern.behavior.command;

import android.util.Log;

/**
 * Created by user on 2018/2/14.
 * 开灯命令
 */

public class TurnLightCommand implements Command{
    String name = "开灯命令";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
       Log.e("command",name+"被执行了");
    }
}
