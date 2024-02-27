package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class Selectie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectie);
    }


    public void bntDescriere(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView7, Descriere_Capitole.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }

    public void bntCap1(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView7, Cap1.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }

    public void bntCap2(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView7, Cap2.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }

    public void bntCap3(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView7, Cap3.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }

    public void bntCap4(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView7, Cap4.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
    }
}