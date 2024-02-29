package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vidra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidra);
    }
    public void BackBtn(View view){
        Intent intent = new Intent(Vidra.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void NextBtn(View view){
        Intent intent = new Intent(Vidra.this, Foca.class);
        startActivity(intent);
        finish();
    }
}