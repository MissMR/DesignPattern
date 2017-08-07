package com.mingren.administrator.designpattern.establish.factory;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 *  简单工厂
 *  通过传递不同参数，构造不同对象
 */
public class SimpleFactoryFragment extends BaseFragment {
    Button function,jump;
    People people;
    SimpleFactor simpleFactor = new SimpleFactor();
    boolean isChinese;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_simple_factory;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
            function = view.findViewById(R.id.function);
            jump = view.findViewById(R.id.jump);
        // 简单工厂运行
        function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isChinese){
                    isChinese = false;
                    simpleFactor.say(1);
                }else {
                    simpleFactor.say(2);
                    isChinese = true;
                }
            }
        });

        // 跳转工厂方法
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    addFragment(new MethodFactoryFragment());
            }
        });
    }


    class SimpleFactor{
        public void say(int type){
            switch (type){
                case 1:
                   people = new Chinese();
                    people.say();
                    break;
                case 2:
                    people = new American();
                    people.say();
                    break;
            }
        }
    }

}
