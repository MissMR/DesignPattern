package com.mingren.administrator.designpattern.behavior.object;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 *  观察模式
 */
public class ObserverFragment extends BaseFragment {
    ListView listView;
    Adapter adapter;
    List<String> list;
    Button button;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_observer;
    }

    private void  initData(){
        list.add("测试一");
        list.add("测试一");
        list.add("测试一");
        list.add("测试一");
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        listView = view.findViewById(R.id.lv);
        list = new ArrayList<>();
        initData();

        adapter = new Adapter(list,getMyActivity());
        listView.setAdapter(adapter);

        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add("新增加一项");
                list.add("新增加一项");
                adapter.notifyDataSetChanged();
            }
        });


    }
}
