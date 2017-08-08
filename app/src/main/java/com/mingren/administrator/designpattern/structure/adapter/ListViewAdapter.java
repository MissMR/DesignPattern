package com.mingren.administrator.designpattern.structure.adapter;

/**
 * Created by Administrator on 2017/8/8.
 */

public interface ListViewAdapter {
    int getCount();
    String getMessage();
    void notifyDataSetChanged();

}
