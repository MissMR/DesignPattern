package com.mingren.administrator.designpattern.establish.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.AppActivity;
import com.mingren.lib.baselibrary.basefragment.BaseActivity;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 *  工厂模式
 */
public class FactoryMethodActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return new SimpleFactoryFragment();
    }

}
