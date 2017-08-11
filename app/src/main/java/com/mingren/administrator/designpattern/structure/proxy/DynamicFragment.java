package com.mingren.administrator.designpattern.structure.proxy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.administrator.designpattern.modle.American;
import com.mingren.administrator.designpattern.modle.Chinese;
import com.mingren.administrator.designpattern.modle.People;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.lang.reflect.Proxy;

/**
 * A simple {@link Fragment} subclass.
 */
public class DynamicFragment extends BaseFragment {
    DynamicProxy proxy;
    People people;
    Button ceshi;
    boolean isChinese = true;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_dynamic;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        ceshi = view.findViewById(R.id.ceshi);
        ceshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isChinese){
                    people = new American();
                    proxy = new DynamicProxy(people);
                    people = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(),
                            people.getClass().getInterfaces(), proxy);
                    people.say();
                    isChinese = false;
                }else {
                    people = new Chinese();
                    proxy = new DynamicProxy(people);
                    people = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(),
                            people.getClass().getInterfaces(), proxy);
                    people.say();
                    isChinese = true;
                }

            }
        });

    }
}
