package com.mingren.administrator.designpattern.structure.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 *  适配器模式
 */
public class AdapterFragment extends BaseFragment {
    ListView listView ;
    CustomListViewAdapter adapter;
    List<String> list;
    TextView textView; // 模拟listView显示数据
    Button updata;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_adapter;
    }

    private void initData(){
        list = new ArrayList<>();
        list.add("第一条数据//");
        list.add("第二条数据//");
    }
    @Override
    protected void initView(View view, Bundle savedInstanceState) {

        textView = view.findViewById(R.id.textview);
        updata = view.findViewById(R.id.updata);
        initData();
        listView = new ListView();
        adapter = new CustomListViewAdapter(list,textView);
        listView.setAdater(adapter);

        updata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add("添加一条数据//");
                adapter.setData(list);
                adapter.notifyDataSetChanged();
            }
        });


    }
}
