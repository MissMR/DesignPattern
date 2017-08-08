package com.mingren.administrator.designpattern.modle;

import android.util.Log;

/**
 * 美国人
 */

public class American implements People {
    @Override
    public void say() {
        Log.e("say","speak English");
    }
}
