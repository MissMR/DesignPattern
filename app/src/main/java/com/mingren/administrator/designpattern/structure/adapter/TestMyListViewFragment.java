package com.mingren.administrator.designpattern.structure.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;


public class TestMyListViewFragment extends BaseFragment {
    MyListView listView;
    MyListViewAdapter adapter;
    List<String> list = null;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_test_my_list_view;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
            listView = view.findViewById(R.id.mlv);
        list = new ArrayList<>();
        list.add("测试6666666");
        list.add("测试55555");
        list.add("测试6666666");
        adapter = new MyListViewAdapter(getMyActivity(),list);
        listView.setAdapter(adapter);
    }
}
