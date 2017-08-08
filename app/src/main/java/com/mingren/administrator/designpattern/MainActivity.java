package com.mingren.administrator.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.mingren.lib.baselibrary.basefragment.AppActivity;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

public class MainActivity extends AppActivity {
    @Override
    protected BaseFragment getFirstFragment() {
        return new MainFragment();
    }

}
