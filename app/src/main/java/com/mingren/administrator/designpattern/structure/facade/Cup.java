package com.mingren.administrator.designpattern.structure.facade;

import android.content.Context;
import android.util.Log;

import com.mingren.lib.baselibrary.utils.ToastUtils;

/**
 *  部件角色  Cpu
 */

public class Cup {
    public void start(Context context){
        //ToastUtils.showToast(context,"Cup start");
        Log.e("end","Cup start");
    }

    public void end(Context context){
       // ToastUtils.showToast(context,"Cup end");
        Log.e("end","Cup end");
    }
}
