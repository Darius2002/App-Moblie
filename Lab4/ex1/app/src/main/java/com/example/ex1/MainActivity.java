package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView afisare;
    private EditText nr1;
    private EditText nr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Adunare(View view){
       afisare = findViewById(R.id.afisare);
       nr1 = findViewById(R.id.Numar1);
       nr2 = findViewById(R.id.Numar2);



        String numar1 = nr1.getText().toString();
        String numar2 = nr2.getText().toString();


        try{
            double dNumar1 = Double.parseDouble(numar1);
            double dNumar2 = Double.parseDouble(numar2);
            dNumar1 += dNumar2;
            afisare.setText(String.valueOf("= " + dNumar1));
        }catch (Exception ex){
            Toast.makeText(this, "Introduceți un număr valid", Toast.LENGTH_SHORT).show();
        }
    }

    public void Scadere(View view){
        afisare = findViewById(R.id.afisare);
        nr1 = findViewById(R.id.Numar1);
        nr2 = findViewById(R.id.Numar2);



        String numar1 = nr1.getText().toString();
        String numar2 = nr2.getText().toString();


        try{
            double dNumar1 = Double.parseDouble(numar1);
            double dNumar2 = Double.parseDouble(numar2);
            dNumar1 -= dNumar2;
            afisare.setText(String.valueOf("= " + dNumar1));
        }catch (Exception ex){
            Toast.makeText(this, "Introduceți un număr valid", Toast.LENGTH_SHORT).show();
        }
    }

    public void Inmultire(View view){
        afisare = findViewById(R.id.afisare);
        nr1 = findViewById(R.id.Numar1);
        nr2 = findViewById(R.id.Numar2);



        String numar1 = nr1.getText().toString();
        String numar2 = nr2.getText().toString();


        try{
            double dNumar1 = Double.parseDouble(numar1);
            double dNumar2 = Double.parseDouble(numar2);
            dNumar1 *= dNumar2;
            afisare.setText(String.valueOf("= " + dNumar1));
        }catch (Exception ex){
            Toast.makeText(this, "Introduceți un număr valid", Toast.LENGTH_SHORT).show();
        }
    }

    public void Impartire(View view){
        afisare = findViewById(R.id.afisare);
        nr1 = findViewById(R.id.Numar1);
        nr2 = findViewById(R.id.Numar2);



        String numar1 = nr1.getText().toString();
        String numar2 = nr2.getText().toString();


        try{
            double dNumar1 = Double.parseDouble(numar1);
            double dNumar2 = Double.parseDouble(numar2);
            dNumar1 /= dNumar2;
            afisare.setText(String.valueOf("= " + dNumar1));
        }catch (Exception ex){
            Toast.makeText(this, "Introduceți un număr valid", Toast.LENGTH_SHORT).show();
        }
    }
}