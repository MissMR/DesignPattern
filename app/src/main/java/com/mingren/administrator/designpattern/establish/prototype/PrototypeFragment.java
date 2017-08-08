package com.mingren.administrator.designpattern.establish.prototype;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mingren.administrator.designpattern.R;
import com.mingren.administrator.designpattern.establish.builder.Builder;
import com.mingren.administrator.designpattern.establish.builder.BuilderBean;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.io.IOException;

/**
 *  原型模式
 */
public class PrototypeFragment extends BaseFragment implements View.OnClickListener {
    PrototypeBean bean1,bean2;
    BuilderBean builderBean;
    Button button1,button2,button3;
    TextView textView;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_prototype;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        builderBean = new BuilderBean();
        builderBean.setName("builder");
        bean1 = new PrototypeBean("Prototype","男","18354232734",builderBean);
        textView = view.findViewById(R.id.text);
        button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = view.findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                // 浅复制
                try {
                    bean2 = bean1.clone();
                    textView.setText(bean2.toString());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.button2:
                try {
                    bean2 = bean1.deepClone();
                    textView.setText(bean2.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.button3 :
               builderBean.setName("修改");
                textView.setText(bean2.toString());

                break;
        }

    }
}
