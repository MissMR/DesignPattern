package com.mingren.administrator.designpattern.establish.factory;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.administrator.designpattern.modle.American;
import com.mingren.administrator.designpattern.modle.Chinese;
import com.mingren.administrator.designpattern.modle.People;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * 抽象工厂模式
 * 多工厂模式的抽象，父类引用指向子类对象
 */
public class AbstractFactoryFragment extends BaseFragment {
    Button function;
    People people;
    boolean isChinese;
    BaseAbstractFactory abstractFactory = new AbstractFactory(); //  父类引用指向子类对象

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

    // 所有工厂的抽象
    interface BaseAbstractFactory{
        void ChineseSay();
        void AmericanSay();
    }

    // 子类工厂
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
