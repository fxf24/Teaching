package com.example.test.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class Grid_Adapter extends BaseAdapter {
    ArrayList<Grid_data> data;
    Context context;

    public Grid_Adapter(ArrayList<Grid_data> data, Context context){
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView = new Grid_View1(context);
        }

        ((Grid_View1)convertView).setData(data.get(position));
        return convertView;
    }
}
