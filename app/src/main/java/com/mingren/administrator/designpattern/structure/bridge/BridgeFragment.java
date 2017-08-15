package com.mingren.administrator.designpattern.structure.bridge;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mingren.administrator.designpattern.R;
import com.mingren.lib.baselibrary.basefragment.BaseFragment;

/**
 * 桥接模式
 * jdbc链接数据库，通过提供统一的接口，可以链接不同的数据库
 *
 */
public class BridgeFragment extends BaseFragment implements View.OnClickListener {

    JDBC jdbc;
    Button b_sql,b_oracle,add,updata,delete,select;
    EditText editText;
    TextView textView;
    MySql mySql;
    Oracle oracle;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_bridge;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        textView = view.findViewById(R.id.tv);
        editText = view.findViewById(R.id.ed);

        b_oracle = view.findViewById(R.id.oracle);
        b_sql = view.findViewById(R.id.sql);
        add = view.findViewById(R.id.add);
        updata = view.findViewById(R.id.updata);
        delete = view.findViewById(R.id.delete);
        select = view.findViewById(R.id.select);

        jdbc = new JDBC();
        mySql = new MySql();
        oracle = new Oracle();

        b_oracle.setOnClickListener(this);
        b_sql.setOnClickListener(this);
        add.setOnClickListener(this);
        updata.setOnClickListener(this);
        delete.setOnClickListener(this);
        select.setOnClickListener(this);

        jdbc.setDatabase(oracle);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.oracle:
               jdbc.setDatabase(oracle);
                break;

            case R.id.sql:
                jdbc.setDatabase(mySql);
                break;

            case R.id.add:
                jdbc.add(editText.getText().toString());
                editText.setText("");
                break;

            case R.id.updata:
                jdbc.updata(editText.getText().toString(),"修改");
                editText.setText("");
                break;

            case R.id.delete:
                jdbc.delete(editText.getText().toString());
                editText.setText("");
                break;

            case R.id.select:
                textView.setText(jdbc.select());
                break;

        }
    }
}
