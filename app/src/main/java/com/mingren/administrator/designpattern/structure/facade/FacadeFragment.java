package com.mingren.administrator.designpattern.structure.facade;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * 外观模式
 *  通过门面角色，将部件角色自由组合
 */
public class FacadeFragment extends BaseFragment {

    Button start,end;
    Computer computer;
    Cup cup ;
    Disk disk;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_facade;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        start = view.findViewById(R.id.start);
        end = view.findViewById(R.id.end);
        cup = new Cup();
        disk = new Disk();
        computer = new Computer(cup,disk,getMyActivity());
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computer.start();
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computer.end();
            }
        });
    }
}
