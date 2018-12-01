package com.example.lenovo.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {
    int tabcount;
    public Pager(FragmentManager temp,int tabcou)
    {
        super(temp);
        this.tabcount=tabcou;
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0)
        {
            ProductFragment f1=new ProductFragment();
            return f1;
        }
        else if(i==1)
        {
            WishlistFragment f2=new WishlistFragment();
            return f2;
        }
        else if(i==2)
        {
            CartFragment f3=new CartFragment();
            return f3;
        }
        else if(i==3)
        {
            ContactFragment f4=new ContactFragment();
            return f4;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
