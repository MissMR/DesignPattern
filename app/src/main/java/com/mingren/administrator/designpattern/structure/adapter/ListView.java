package com.mingren.administrator.designpattern.structure.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * 适配器模式
 */
public class ListView {

    Context context;
    ListViewAdapter adapter;  // 持有父类适配器的引用

    public void setAdater(ListViewAdapter adater){
        this.adapter = adater;
        Log.e("message",adater.getMessage());  // 可以从adapter取数据
       adater.notifyDataSetChanged(); // 可以直接调用adapter里显示的方法
    }


}
