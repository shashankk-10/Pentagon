package com.shourya.placementbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class company_info extends AppCompatActivity {

    ListView lvItems;
    list_adapter listAdapter;
    String titles[]={"Microsoft","Goldman Sachs","Walmart","Aditya Birla",
            "L & T Power","ONGC","Cairn","Samsung"};
    Integer images[]={R.drawable.microsoft,R.drawable.goldman_sachs,R.drawable.walmart,R.drawable.aditya_birla,
            R.drawable.lnt,R.drawable.ongc,R.drawable.cairn,R.drawable.samsung};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_info);

        lvItems = findViewById(R.id.lvItems);
        listAdapter = new list_adapter(this, titles, images);
        lvItems.setAdapter(listAdapter);

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case  0:
                        Intent i=new Intent(getApplicationContext(),microsoft.class);
                        startActivity(i);
                        break;
                    case  1:
                        Intent i1=new Intent(getApplicationContext(),goldman_sachs.class);
                        startActivity(i1);
                        break;
                    case  2:
                        Intent i2=new Intent(getApplicationContext(),walmart.class);
                        startActivity(i2);
                        break;
                    case  3:
                        Intent i3=new Intent(getApplicationContext(),aditya_birla.class);
                        startActivity(i3);
                        break;
                    case  4:
                        Intent i4=new Intent(getApplicationContext(),lnt.class);
                        startActivity(i4);
                        break;
                    case  5:
                        Intent i5=new Intent(getApplicationContext(),ongc.class);
                        startActivity(i5);
                        break;
                    case  6:
                        Intent i6=new Intent(getApplicationContext(),cairn.class);
                        startActivity(i6);
                        break;
                    case  7:
                        Intent i7=new Intent(getApplicationContext(),samsung.class);
                        startActivity(i7);
                        break;
                }
            }
        });

    }
}