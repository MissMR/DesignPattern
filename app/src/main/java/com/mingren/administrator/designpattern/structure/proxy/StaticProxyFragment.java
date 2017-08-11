package com.mingren.administrator.designpattern.structure.proxy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * 静态代理
 *
 */
public class StaticProxyFragment extends BaseFragment {

    Button b_static,b_dynamic;
    PeopleProxy proxy;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_static_proxy;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        b_static = view.findViewById(R.id.b_static);
        b_dynamic = view.findViewById(R.id.dynamic);
        proxy = new PeopleProxy();
        b_static.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proxy.say();
            }
        });

        b_dynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new DynamicFragment());
            }
        });

    }
}
