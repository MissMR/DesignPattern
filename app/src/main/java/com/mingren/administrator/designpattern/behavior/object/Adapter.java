package com.mingren.administrator.designpattern.behavior.object;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mingren.administrator.designpattern.structure.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 * 具体主题(被观察者)
 */

public class Adapter implements ListViewAdapter, Subject {
    List<String> data ;
    List<Observer> observers;
    TextView textView;
    Context context;

    public Adapter(List<String> data,Context context) {
        this.data = data;
        this.context = context;
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void notifyDataSetChanged() {
        for (Observer observer : observers){
            observer.updata();
        }
    }

    @Override
    public View getView(int position) {
        View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null);
        textView = view.findViewById(android.R.id.text1);
        textView.setText(data.get(position));

        return view;
    }
}
