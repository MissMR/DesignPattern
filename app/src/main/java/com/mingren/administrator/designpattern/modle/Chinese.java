package com.mingren.administrator.designpattern.modle;

import android.util.Log;

/**
 * 中国人
 */

public class Chinese implements People {

    @Override
    public void say() {
        Log.e("say","说中国话");
    }
}
