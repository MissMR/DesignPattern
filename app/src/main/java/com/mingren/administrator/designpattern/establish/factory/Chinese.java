package com.mingren.administrator.designpattern.establish.factory;

import android.util.Log;

import com.mingren.lib.baselibrary.utils.ToastUtils;

/**
 * 中国人
 */

public class Chinese implements People {

    @Override
    public void say() {
        Log.e("say","说中国话");
    }
}
