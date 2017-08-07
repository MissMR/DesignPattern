package com.mingren.lib.baselibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mingren.lib.baselibrary.basefragment.BaseFragment;

import java.util.List;


public class Fragment1 extends BaseFragment {

    TextView tv;
    @Override
    protected int getLayoutId() {
        return  R.layout.fragment_fragment1;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
     tv = (TextView) view.findViewById(R.id.tv);
        if (getArguments()!= null){
            String title = (String) getArguments().get("title");
            tv.setText(title);
        }

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tv.setSelected(true);
            }
        });
    }


    class Province{
        String province;
        List<City> citys;
    }

    class City{
        String city;
        List<Area> areas;
    }

    class Area{
        String area;
        List<String> names;
    }
}
