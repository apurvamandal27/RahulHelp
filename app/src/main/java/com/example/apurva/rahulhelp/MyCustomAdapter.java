package com.example.apurva.rahulhelp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends ArrayAdapter {

    int pic[];
    String name1[];
    String name2[];
    Activity activity;

    public MyCustomAdapter(Activity activity,String[] name1,String name2[],int[] pic) {
        super(activity,R.layout.customlistview,name1);
        this.name1=name1;
        this.name2=name2;
        this.pic=pic;
        this.activity=activity;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater layoutInflater=activity.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.customlistview,null);
        ImageView img1=view.findViewById(R.id.imageview);
        TextView t1=view.findViewById(R.id.textview1);
        TextView t2=view.findViewById(R.id.textview2);
        img1.setImageResource(pic[position]);
        t1.setText(name1[position]);
        t2.setText(name2[position]);


        return(view);
    }
}
