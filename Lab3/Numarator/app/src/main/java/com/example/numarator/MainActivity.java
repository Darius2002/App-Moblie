package com.example.numarator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView afisier;
    private int cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cnt(View view){
        cnt++;
    }

    public void Afisare(View view){
        afisier = findViewById(R.id.text1);
        afisier.setText(String.valueOf(cnt));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                afisier.setText("");
            }
        }, 2000);
    }


}