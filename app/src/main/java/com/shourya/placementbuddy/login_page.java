package com.shourya.placementbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_page extends AppCompatActivity {

    EditText etName,etAdm,etBranch;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        etName=findViewById(R.id.etName);
        etAdm=findViewById(R.id.etAdm);
        etBranch=findViewById(R.id.etBranch);

        start=findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString().trim();
                String admno=etAdm.getText().toString().trim();
                String branch=etBranch.getText().toString().trim();
                if(name.equals("") || admno.equals("") || branch.equals(""))
                    Toast.makeText(login_page.this,"The field cannot be empty",Toast.LENGTH_LONG).show();
                else
                {
                    Bundle bdl=new Bundle();
                    bdl.putString("name",name);
                    bdl.putString("admno",admno);
                    bdl.putString("branch",branch);
                    Intent i=new Intent(login_page.this,home_page.class);
                    i.putExtras(bdl);
                    startActivity(i);
                }
            }
        });

    }
}