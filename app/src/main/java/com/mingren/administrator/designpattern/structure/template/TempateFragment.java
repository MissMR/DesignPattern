package com.mingren.administrator.designpattern.structure.template;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * Created by user on 2018/2/14.
 * 模板方法模式
 */

public class TempateFragment extends BaseFragment{
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tempate;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        Log.e("解释:===","参考BaseActivity和BaseFragment，定义模板父类框架，子类实现其具体实现");
    }
}
