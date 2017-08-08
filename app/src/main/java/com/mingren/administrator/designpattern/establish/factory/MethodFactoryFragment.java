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
 *   工厂方法模式
 *   多个工厂，通过不同工厂创建不同子类
 */
public class MethodFactoryFragment extends BaseFragment {
    Button function,jump;
    People people;   // 所有子类的父类
    boolean isChinese;
    ClineseFactory clineseFactory = new ClineseFactory();
    AmericanFactory americanFactory = new AmericanFactory();
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_method_factory;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        function = view.findViewById(R.id.function);
        jump = view.findViewById(R.id.jump);
        // 方法工厂运行
        function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isChinese){
                    isChinese = false;
                    clineseFactory.createPeople().say();
                }else {
                    isChinese = true;
                    americanFactory.createPeople().say();
                }
            }
        });

        // 抽象工厂方法
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new AbstractFactoryFragment());
            }
        });
    }

    // 中国人工厂
    class ClineseFactory implements  PeopleFactory{

        @Override
        public People createPeople() {
           return new Chinese();
        }
    }

    // 美国人工厂
    class AmericanFactory implements  PeopleFactory{

        @Override
        public People createPeople() {
            return new American();
        }
    }


}
