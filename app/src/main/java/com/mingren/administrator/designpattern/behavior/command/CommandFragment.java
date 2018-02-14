package com.mingren.administrator.designpattern.behavior.command;

import android.os.Bundle;
import android.view.View;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * Created by user on 2018/2/14.
 * 命令模式
 */

public class CommandFragment extends BaseFragment{

    Invoker invoker; // 发布命令的人
    Command command; // 命令
    Receiver receiver; // 执行命令的人

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_command;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        invoker = new Invoker();
        command = new TurnLightCommand();
        receiver = new TurnLightReceiver("小明");
        // 命令小明去开灯
        invoker.execute(receiver,command);
    }
}

