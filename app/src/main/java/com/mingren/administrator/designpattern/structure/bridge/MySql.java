package com.mingren.administrator.designpattern.structure.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */

public class MySql implements DataBaseInterface {
    List list = new ArrayList();
    @Override
    public void add(String obj) {
        list.add(obj);
    }

    @Override
    public void delete(String obj) {
        list.remove(obj);
    }

    @Override
    public void updata(String been, String obj) {
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).equals(been)){
                list.remove(i);
                list.add(i,obj);
            }
        }
    }



    @Override
    public String select() {
        return    "MySql : "+ list.toString();
    }
}
