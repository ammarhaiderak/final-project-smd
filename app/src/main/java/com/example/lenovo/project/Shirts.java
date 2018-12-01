package com.example.lenovo.project;

import android.widget.ImageView;

public class Shirts {
    ImageView image;
    String name;
    int price;
    int quantity;

    public Shirts(ImageView im,String n,int p,int q)
    {
        this.image=im;
        this.name=n;
        this.price=p;
        this.quantity=q;
    }
}
