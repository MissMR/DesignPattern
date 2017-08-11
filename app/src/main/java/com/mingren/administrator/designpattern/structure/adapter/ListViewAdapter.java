package com.mingren.administrator.designpattern.structure.adapter;

import android.view.View;

/**
 * Created by Administrator on 2017/8/8.
 */

public interface ListViewAdapter {
    int getCount();
    String getMessage();
    void notifyDataSetChanged();
    View getView(int position);

}
