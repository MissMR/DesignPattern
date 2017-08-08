package com.mingren.administrator.designpattern.structure.adapter;

import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */

public class CustomListViewAdapter implements ListViewAdapter {
    List<String> list;
    TextView textView;

    public CustomListViewAdapter(List<String> list, TextView textView) {
        this.list = list;
        this.textView = textView;
    }

    public void setData(List<String> list){
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getMessage() {
        return list.toString();
    }

    @Override
    public void notifyDataSetChanged() {
            textView.setText(list.toString());
    }
}
