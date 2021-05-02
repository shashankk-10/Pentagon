package com.shourya.placementbuddy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class list_adapter extends ArrayAdapter<String> {
    Activity context;
    String titles[];
    Integer images[];
    public list_adapter(@NonNull Activity context,String titles[],Integer images[])
    {
        super(context,R.layout.list_item,titles);
        this.context=context;
        this.titles=titles;
        this.images=images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View rowview=layoutInflater.inflate(R.layout.list_item,null,true);
        TextView tvTitle=rowview.findViewById(R.id.tvTitle);
        ImageView ivIcon=rowview.findViewById(R.id.ivIcons);
        tvTitle.setText(titles[position]);
        ivIcon.setImageResource(images[position]);
        return rowview;
    }
}
