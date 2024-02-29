package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Foca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foca);
    }
    public void NextBtn(View view){
        Intent intent = new Intent(Foca.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void BackBtn(View view){
        Intent intent = new Intent(Foca.this, Vidra.class);
        startActivity(intent);
        finish();
    }


}