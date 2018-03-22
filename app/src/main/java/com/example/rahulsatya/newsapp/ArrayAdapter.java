package com.example.rahulsatya.newsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rahulsatya on 12/03/18.
 */

public class ArrayAdapter extends android.widget.ArrayAdapter<CardActivity>{

    Context context;

    public ArrayAdapter(Context context, int resourceId, List<CardActivity> items)
    {
        super(context, resourceId, items);
    }


    public View getView(int position, View convertView, ViewGroup parent)
    {
        CardActivity cardItem = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.content);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        name.setText(cardItem.getName());
        image.setImageResource(R.mipmap.ic_launcher); //add image using glide with the help of the image url. Make sure news article has image too
        return convertView;
    }
}
