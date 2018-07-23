package com.example.user.title;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /**  ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }  **/

        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button)findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getApplicationContext()).finish();
            }
        });

        titleEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked Edit button", Toast.LENGTH_SHORT).show();
            }
        });

        //This is my test code


    }
}
