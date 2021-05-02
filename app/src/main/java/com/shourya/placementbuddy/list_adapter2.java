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

import com.github.barteksc.pdfviewer.PDFView;

public class list_adapter2 extends ArrayAdapter<String> {
    Activity context;
    String titles[];
    public list_adapter2(@NonNull Activity context,String titles[])
    {
        super(context,R.layout.list_item2,titles);
        this.context=context;
        this.titles=titles;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View rowview=layoutInflater.inflate(R.layout.list_item2,null,true);
        TextView tvTitle=rowview.findViewById(R.id.tvTitle);
        tvTitle.setText(titles[position]);
        return rowview;
    }
}
