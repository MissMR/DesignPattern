package com.mingren.administrator.designpattern.structure.bridge;

/**
 * 桥接类
 */

public class JDBC implements DataBaseInterface {
    DataBaseInterface database;

    @Override
    public void add(String obj) {
        database.add(obj);
    }

    @Override
    public void delete(String obj) {
        database.delete(obj);
    }

    @Override
    public void updata(String been, String obj) {
        database.updata(been,obj);
    }


    @Override
    public String select() {
        return  database.select();
    }



    public void setDatabase(DataBaseInterface database) {
        this.database = database;
    }

    public DataBaseInterface getDatabase() {
        return database;
    }
}
