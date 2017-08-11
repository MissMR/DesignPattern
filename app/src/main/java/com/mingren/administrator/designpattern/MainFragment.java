package com.mingren.administrator.designpattern;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mingren.administrator.designpattern.establish.builder.BuilderFragment;
import com.mingren.administrator.designpattern.establish.factory.SimpleFactoryFragment;
import com.mingren.administrator.designpattern.establish.prototype.PrototypeFragment;
import com.mingren.administrator.designpattern.structure.adapter.AdapterFragment;
import com.mingren.administrator.designpattern.structure.adapter.TestMyListViewFragment;
import com.mingren.administrator.designpattern.structure.decorator.DecoratorFragment;
import com.mingren.administrator.designpattern.structure.proxy.StaticProxyFragment;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/8.
 */

public class MainFragment extends BaseFragment {

   ListView listView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter adapter;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void initData(){
        list.clear();
        list.add("工厂模式");
        list.add("建造者模式");
        list.add("原型模式");
        list.add("适配器模式");
        list.add("装饰模式");
        list.add("代理模式");
    }
    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        listView = view.findViewById(R.id.list);
        initData();

        adapter = new ArrayAdapter(getMyActivity(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        // 工厂模式
                        addFragment(new SimpleFactoryFragment());
                        break;
                    case 1:
                        // 建造者模式
                        addFragment(new BuilderFragment());
                        break;
                    case 2:
                        // 原型模式
                        addFragment(new PrototypeFragment());
                        break;
                    case 3:
                        // 适配器模式
                      //  addFragment(new AdapterFragment());
                        addFragment(new TestMyListViewFragment());
                        break;
                    case 4:
                        // 装饰模式
                        addFragment(new DecoratorFragment());
                        break;
                    case 5:
                        // 代理模式
                        addFragment(new StaticProxyFragment());
                        break;
                }
            }
        });
    }
}
