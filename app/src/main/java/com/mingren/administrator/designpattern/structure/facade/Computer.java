package com.mingren.administrator.designpattern.structure.facade;

import android.content.Context;

/**
 * 门面角色
 * 用户直接调用的
 */

public class Computer {
    Cup cup;
    Disk disk;
    Context context;

    public Computer(Cup cup, Disk disk,Context context) {
        this.cup = cup;
        this.disk = disk;
        this.context = context;
    }

    public void start(){
        cup.start(context);
        disk.start(context);
    };

    public void end(){
        cup.end(context);
        disk.end(context);
    }
}
