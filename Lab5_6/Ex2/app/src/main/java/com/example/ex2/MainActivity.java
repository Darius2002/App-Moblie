package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextBtn(View view){
        Intent intent = new Intent(MainActivity.this, Vidra.class);
        startActivity(intent);
        finish();
    }
    public void BackBtn(View view){
        Intent intent = new Intent(MainActivity.this, Foca.class);
        startActivity(intent);
        finish();
    }

}