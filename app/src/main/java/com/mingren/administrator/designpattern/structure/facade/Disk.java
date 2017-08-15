package com.mingren.administrator.designpattern.structure.facade;

import android.content.Context;
import android.util.Log;

import com.mingren.lib.baselibrary.utils.ToastUtils;

/**
 *  部件角色  Cpu
 */

public class Disk {
    public void start(Context context){
        Log.e("end","Disk start");
    }

    public void end(Context context){
        Log.e("end","Disk End");
    }
}
