package com.mingren.administrator.designpattern.structure.decorator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.administrator.designpattern.modle.Chinese;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * 装饰模式
 * 应用场景： 动态为一个类增加/撤销功能
 */
public class DecoratorFragment extends BaseFragment {
    Button log,add;
    Chinese chinese = new Chinese();
    PeopleDecorator decorator;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_decorator;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        log = view.findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chinese.say();
            }
        });

        add = view.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decorator = new PeopleDecorator(chinese);
                decorator.say();
            }
        });
    }


}
