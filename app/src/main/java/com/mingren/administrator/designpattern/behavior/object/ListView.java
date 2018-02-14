package com.mingren.administrator.designpattern.behavior.object;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/8/18.
 */

public class ListView extends LinearLayout implements Observer {

   Adapter adapter = null;
    int count;
    public ListView(Context context) {
        super(context);
        this.setOrientation(VERTICAL);
    }

    public ListView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setOrientation(VERTICAL);
    }

    public ListView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOrientation(VERTICAL);
    }

    public void setAdapter( Adapter adapter){
        adapter.addObserver(this);  // 注册观察者

        count = adapter.getCount();
        for (int position = 0; position<count;position++){
            View view = adapter.getView(position);
            this.addView(view);
        }
        this.adapter = adapter;
    }

    @Override
    public void updata() {
        count = adapter.getCount();
        this.removeAllViews();
        for (int position = 0; position<count;position++){
            View view = adapter.getView(position);
            this.addView(view);
        }
    }
}
