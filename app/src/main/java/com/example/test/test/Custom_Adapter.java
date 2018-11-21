package com.example.test.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom_Adapter extends BaseAdapter {
    ArrayList<Data> data;
    Context context;

    public Custom_Adapter(ArrayList<Data> data, Context context){
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
        LayoutInflater inflater = LayoutInflater.from(context);
        if(convertView ==null){
            convertView =inflater.inflate(R.layout.custom_listview1, null);
        }

        ImageView image1 = convertView.findViewById(R.id.image);
        TextView tv1= convertView.findViewById(R.id.text1);
        TextView tv2= convertView.findViewById(R.id.text2);

        image1.setImageResource(R.mipmap.ic_launcher);
        tv1.setText(data.get(position).data1);
        tv2.setText(data.get(position).data2);
        return convertView;
    }
}
