package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class CreareContact extends AppCompatActivity {

    ArrayList<Persoane> list = new ArrayList<>();
    private String Nume, Numar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creare_contact);

        Intent intent = getIntent();
        if (intent != null) {
            list = (ArrayList<Persoane>) intent.getSerializableExtra("Lista");
        }
    }

    public void Inapoi(View view){
        Intent intent = new Intent(CreareContact.this, MainActivity.class);
        intent.putExtra("Lista", list);
        startActivity(intent);
    }

    public  void Adaugare(View view){

        EditText etN = findViewById(R.id.NumeTxt);
        EditText etNu= findViewById(R.id.Numartxt);

        if(TextUtils.isEmpty(etN.getText().toString())  ||  TextUtils.isEmpty(etNu.getText().toString()) /*||
                etNu.getText().toString().length() != 10  || !etNu.getText().toString().startsWith("07")*/){
            Toast.makeText(this, "Te rog sa completezi campurile libere sau completeazale corect",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            Nume = etN.getText().toString();
            Numar = etNu.getText().toString();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("Nume", Nume);
            intent.putExtra("Numar", Numar);
            intent.putExtra("Lista", list);
            startActivity(intent);
        }

    }


}