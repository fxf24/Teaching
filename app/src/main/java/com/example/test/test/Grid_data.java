package com.example.test.test;

import android.widget.ImageView;

public class Grid_data {
    int src;
    String text;

    public Grid_data(int src, String text){
        this.src = src;
        this.text = text;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
