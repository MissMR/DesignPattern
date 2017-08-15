package com.mingren.administrator.designpattern.establish.builder;


import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;
import com.mingren.lib.baselibrary.baseview.dialog.PromptBuilder;
import com.mingren.lib.baselibrary.utils.ToastUtils;

/**
 *  建造者模式
 *  应用场景： 创建与描述分离
 */
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
                //   bean = builder.setName("张三").creat();
                new PromptBuilder(getMyActivity())
                        .setTitle("测试标题")
                        .setMessage("这是一个对话框，点击确定，提示确定，点击取消，提示取消")
                        .setOkListener("确认取证",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ToastUtils.showToast(getMyActivity(),"确定");
                                dialogInterface.dismiss();
                            }

                        })
                        .setCancelListener("取消取证",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ToastUtils.showToast(getMyActivity(),"取消");
                                dialogInterface.dismiss();
                            }

                        }).create();


                break;
            case R.id.button2:
                // 名字+性别
              //  bean = builder.setName("李四").setAge("男").creat();

                new PromptBuilder(getMyActivity())
                        .setTitle("测试标题2")
                        .setMessage("这是一个对话框2，点击确定，提示确定，点击取消，提示取消")
                        .setOkListener("确认取证",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ToastUtils.showToast(getMyActivity(),"确定");
                                dialogInterface.dismiss();
                            }

                        })
                        .setCancelListener("取消取证",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ToastUtils.showToast(getMyActivity(),"取消");
                                dialogInterface.dismiss();
                            }

                        }).create();
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
