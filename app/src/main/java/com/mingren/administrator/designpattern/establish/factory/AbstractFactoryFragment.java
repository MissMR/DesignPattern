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
 * 抽象工厂模式
 */
public class AbstractFactoryFragment extends BaseFragment {
    Button function;
    People people;
    boolean isChinese;
    BaseAbstractFactory abstractFactory = new AbstractFactory();
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_abstract_factory;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        function = view.findViewById(R.id.function);
        // 方法工厂运行
        function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isChinese){
                    isChinese = false;
                    abstractFactory.ChineseSay();
                }else {
                    isChinese = true;
                    abstractFactory.AmericanSay();
                }
            }
        });
    }

    interface BaseAbstractFactory{
        void ChineseSay();
        void AmericanSay();
    }

    class AbstractFactory implements  BaseAbstractFactory{

        @Override
        public void ChineseSay() {
            new Chinese().say();
        }

        @Override
        public void AmericanSay() {
            new American().say();
        }
    }

}
