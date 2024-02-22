package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button apas;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apas = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.mama);
    }

    public void Apasat(View view){
        text.setText("Modifvat");
        System.out.println("Buton apasat");
    }

}