package com.shourya.placementbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class important_concepts extends AppCompatActivity {

    ListView lvItems;
    list_adapter2 listAdapter;
    String titles[]={"Binary Search","Dynamic Programming","Graphs and Trees","Searching","Hashing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_concepts);

        lvItems = findViewById(R.id.lvItems);
        listAdapter = new list_adapter2(this, titles);
        lvItems.setAdapter(listAdapter);

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case  0:
                        Intent i=new Intent(getApplicationContext(),binary_search.class);
                        startActivity(i);
                        break;
                    case  1:
                        Intent i1=new Intent(getApplicationContext(),dp.class);
                        startActivity(i1);
                        break;
                    case  2:
                        Intent i2=new Intent(getApplicationContext(),graphs.class);
                        startActivity(i2);
                        break;
                    case  3:
                        Intent i3=new Intent(getApplicationContext(),searching.class);
                        startActivity(i3);
                        break;
                    case  4:
                        Intent i4=new Intent(getApplicationContext(),hashing.class);
                        startActivity(i4);
                        break;
                }
            }
        });

    }
}