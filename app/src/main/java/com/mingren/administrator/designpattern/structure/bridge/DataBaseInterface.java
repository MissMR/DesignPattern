package com.mingren.administrator.designpattern.structure.bridge;

/**
 * 提供的被连接数据库的接口
 */

public interface DataBaseInterface {
    void add(String obj);
    void delete(String obj);
    void updata(String been,String obj);
    String select();
}
