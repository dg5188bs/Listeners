package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView redtv,bluetv,winnertv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent gi = getIntent();
        int ii = gi.getIntExtra("i",-9999);
        int kk = gi.getIntExtra("k",-9999);
        redtv = (TextView) findViewById(R.id.textView);
        winnertv = (TextView) findViewById(R.id.textView2);
        bluetv = (TextView) findViewById(R.id.textView3);
        redtv.setText("Red's score is: "+kk);
        bluetv.setText("Blue's score is: "+ii);
        if(kk>ii){
            winnertv.setText("Red is the winner");}
        if(ii>kk){
            winnertv.setText("Blue is the winner");
        }
        if (kk==ii){
            winnertv.setText("draw!");
        }
    }

    public void back(View view) {
        finish();
    }
}
