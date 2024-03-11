package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Sterger_Editare_Info extends AppCompatActivity {

    private ArrayList<Persoane> vec = new ArrayList<>();
    private String nume, numar;
    private EditText NumeT;
    private EditText NumarT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sterger_editare_info);


        Intent intent = getIntent();

        vec = (ArrayList<Persoane>) intent.getSerializableExtra("Lista");
        nume = intent.getStringExtra("Nume");
        NumeT = findViewById(R.id.NumeText);
        NumarT = findViewById(R.id.NumarText);



        for (int i = 0; i < vec.size(); ++i){
            Persoane per = vec.get(i);
            if(per.nume.equals(nume)){
                NumarT.setText(per.numar);
                NumeT.setText(per.nume);
                numar = per.numar;
                break;
            }
        }

    }


    public void BtnInapoi(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Lista", vec);
        startActivity(intent);
    }

    public void BtnSterge(View view){
        for (int i = 0; i < vec.size(); ++i){
            Persoane per = vec.get(i);
            if(per.nume.equals(nume)){
                vec.remove(i);
                break;
            }
        }
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Lista", vec);
        startActivity(intent);
    }

    public void BtnEditare(View view){
        NumeT = findViewById(R.id.NumeText);
        NumarT = findViewById(R.id.NumarText);
        if(TextUtils.isEmpty(NumeT.getText().toString())  ||  TextUtils.isEmpty(NumarT.getText().toString()) /*||
                NumarT.getText().toString().length() != 10  || !NumarT.getText().toString().startsWith("07")*/) {
            Toast.makeText(this, "Contactul nu a fost modificat deoarece nu ati modifcat corect campurile",
                    Toast.LENGTH_SHORT).show();
        }
        else{
            for (int i = 0; i < vec.size(); ++i) {
                Persoane per = vec.get(i);
                if (per.nume.equals(nume)) {
                    per.nume = NumeT.getText().toString();
                    per.numar = NumarT.getText().toString();
                    break;
                }
            }
        }
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Lista", vec);
        startActivity(intent);
    }

    public void btnSuna(View view){
        String tel = "tel:";
        String rez = tel + numar;
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(rez));
        startActivity(intent);
    }
}

