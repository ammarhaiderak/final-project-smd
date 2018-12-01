package com.example.lenovo.project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class ProductFragment extends Fragment {
    arrayAdapter ShirtAdapter;
    ArrayList<Shirts> ShirtList=new ArrayList<>();
    ListView viewList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_product,container,false);
        list(view);
        return view;


    }
    public void list(View view)
    {
        ImageView image=new ImageView(getContext());

        image.setImageResource(R.drawable.shirt_pic);

        Shirts temp=new Shirts(image,"Polo",1000,10);
        ShirtList.add(temp);

        //ShirtAdapter= new  arrayAdapter(getActivity(), ShirtList);
        //viewList = (ListView)getView().findViewById(R.id.listview);
        //viewList.setAdapter(ShirtAdapter);

    }
}
