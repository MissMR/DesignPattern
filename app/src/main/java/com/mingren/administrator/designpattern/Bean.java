package com.mingren.administrator.designpattern;

import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 */

public class Bean {
    List<BeanItem> list;


    class BeanItem{
        String name;
        String age;
        List<BeanItem> list;
    }



}


