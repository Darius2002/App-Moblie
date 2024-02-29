package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina_Noua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_noua);
    }
    public void InapoiBtn(View view){
        Intent intent = new Intent(Pagina_Noua.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}