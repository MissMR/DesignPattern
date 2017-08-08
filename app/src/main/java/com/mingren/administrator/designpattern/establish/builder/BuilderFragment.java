package com.mingren.administrator.designpattern.establish.builder;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

public class BuilderFragment extends BaseFragment implements View.OnClickListener {

    TextView exhibition;
    Button button1,button2,button3;

    Builder builder = new Builder();
    BuilderBean bean;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_builder;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        exhibition = view.findViewById(R.id.exhibition);
        button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int tag = view.getId();
        switch (tag){
            case R.id.button1:
                // 只有名字
                bean = builder.setName("张三").creat();
                break;
            case R.id.button2:
                // 名字+性别
                bean = builder.setName("李四").setAge("男").creat();
                break;
            case R.id.button3:
                // 名字+性别+电话
                bean = builder.setName("赵武").setAge("女").setTel("18354232734").creat();
                break;

        }
        if (bean != null)
        exhibition.setText(bean.toString());
    }
}
