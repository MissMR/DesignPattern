package com.mingren.administrator.designpattern.structure.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/8/11.
 */

public class MyListView extends LinearLayout {
   Context context;
    ListViewAdapter adapter;
    int count; // 子布局的个数

    public MyListView(Context context) {
        super(context);
        initView(context);
    }

    public MyListView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MyListView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }


    private void initView(Context context){
        this.context = context;
        this.setOrientation(LinearLayout.VERTICAL);
    }

    /**
     *  得到adapter
     *  获取childview的数量
     *  循环获取itemview，添加的LinearLayout中
     * @param adapter
     */
    public void setAdapter(ListViewAdapter adapter){
        this.adapter = adapter;
        count = adapter.getCount();
        for (int position = 0; position<count;position++){
            View view = adapter.getView(position);
            this.addView(view);
        }
    }


}
