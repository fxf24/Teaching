package com.example.test.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Next_page extends AppCompatActivity {
    ArrayList<Data> container;
    Custom_Adapter adapter;
    ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        container = new ArrayList<>();
        list1 = findViewById(R.id.list_view1);
        adapter = new Custom_Adapter(container, this);

        container.add(new Data("사과", "포도"));
        container.add(new Data("사과", "포도"));
        container.add(new Data("사과", "포도"));

        list1.setAdapter(adapter);
    }
}
