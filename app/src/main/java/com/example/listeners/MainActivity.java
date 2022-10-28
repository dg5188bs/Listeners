package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button red,blue,results;
    int i;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = (Button) findViewById(R.id.Red);
        blue = (Button) findViewById(R.id.Blue);
        results = (Button) findViewById(R.id.results);
        i = 0;
        k = 0;
        blue.setOnClickListener(this);
        red.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                k = k+2;
                return false;
            }
        });
   }

    @Override
    public void onClick(View view) {

        i++;
    }

    public void results(View view) {
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("i",i);
        si.putExtra("k",k);
        startActivity(si);
        i = 0;
        k = 0;
    }
}