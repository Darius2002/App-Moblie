package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act2 extends AppCompatActivity {
    private ArrayList<String> fisier = new ArrayList<>();
    private TextView text;
    private EditText trimis;
    private int cnt = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        citesteFisierText("Text.txt");
        text = findViewById(R.id.afisare);
        trimis = findViewById(R.id.trimite);

        if(!fisier.isEmpty()) {
            text.setText(fisier.get(0));
        }
        else{
            Log.d("Eroare", "Eroare la lista");
        }
    }


    private void citesteFisierText(String numeFisier) {

        try {
            InputStream inputStream = getAssets().open(numeFisier);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String linie;

            while ((linie = bufferedReader.readLine()) != null) {
                fisier.add(linie);
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void BtnSend(View view){
        String Etext = trimis.getText().toString();
        trimis.setText("");

        if(TextUtils.isEmpty(Etext)){
            Toast.makeText(this, "Va rog sa introduceti text in campul din stanga jos", Toast.LENGTH_SHORT).show();
        }
        else{
            String con = "\nTu: " + Etext;
            text.append(con);
            if(cnt < fisier.size()) {
                String Andrei = "\n" + fisier.get(cnt);
                ++cnt;
                text.append(Andrei);
            }
        }
    }
}

