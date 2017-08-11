package com.mingren.administrator.designpattern.structure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mingren.administrator.designpattern.R;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11.
 */

public class MyListViewAdapter implements ListViewAdapter {
    Context context;
    List<String> list;

    public MyListViewAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void notifyDataSetChanged() {

    }
    TextView textView = null;
    @Override
    public View getView(int position) {
        View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null);
           textView = view.findViewById(android.R.id.text1);
             textView.setText(list.get(position));

        return view;
    }


}
