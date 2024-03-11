package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Persoane> vector = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if(intent != null){
            if(intent.hasExtra("Nume") && intent.hasExtra("Numar") && intent.hasExtra("Lista")){
                String nume = intent.getStringExtra("Nume");
                String numar = intent.getStringExtra("Numar");
                Persoane persoane = new Persoane(nume, numar);
                vector = (ArrayList<Persoane>) intent.getSerializableExtra("Lista");
                vector.add(persoane);
                textnou();
            }
            else if(!intent.hasExtra("Nume") && !intent.hasExtra("Numar") && intent.hasExtra("Lista")){
                vector = (ArrayList<Persoane>) intent.getSerializableExtra("Lista");
                textnou();
            }
        }

    }

    public void AdaugareContact(View view){
        Intent intent = new Intent(MainActivity.this, CreareContact.class);
        intent.putExtra("Lista", vector);
        startActivity(intent);
    }

    private void textnou(){
        LinearLayout leaut = findViewById(R.id.Liniear);
            for (int i = 0; i < vector.size(); ++i) {
                Persoane per = vector.get(i);
                TextView nou = new TextView(this);
                nou.setId(View.generateViewId());
                nou.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        200
                ));
                nou.setText(per.nume);
                nou.setTextSize(34);
                nou.setGravity(Gravity.CENTER);
                nou.setTag(per.nume);

                nou.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Sterger_Editare_Info(view);
                    }
                });


                leaut.addView(nou);
            }
    }
    private void Sterger_Editare_Info(View view){
        Intent intent = new Intent(MainActivity.this, Sterger_Editare_Info.class);

        intent.putExtra("Lista", vector);

        intent.putExtra("Nume", (String) view.getTag());

        startActivity(intent);
    }
}