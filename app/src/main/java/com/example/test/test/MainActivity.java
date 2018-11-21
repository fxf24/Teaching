package com.example.test.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1, l2;

    ArrayList<Grid_data> data;
    Grid_Adapter grid_adapter;
    GridView gv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = findViewById(R.id.line1);
        l2 = findViewById(R.id.line2);

        data = new ArrayList<>();
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));
        data.add(new Grid_data(R.mipmap.ic_launcher, "사과"));

        gv1 = findViewById(R.id.grid_view1);
        grid_adapter = new Grid_Adapter(data, this);
        gv1.setAdapter(grid_adapter);

        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Next_page.class);
                startActivity(intent);
            }
        });
    }

    public void OnClick(View v){
        if(v.getId() == R.id.button1){
            l1.setVisibility(View.INVISIBLE);
            l2.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.button2){
            l2.setVisibility(View.INVISIBLE);
            l1.setVisibility(View.VISIBLE);
        }
    }
}
