package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView afisare;
    private Button stop, start, reset;
    private  int secunde, minute, milisec;
    private long milisec1, start_Time, Time_Buff, Update_Time = 0L;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        afisare = findViewById(R.id.textV);
        stop = findViewById(R.id.button2);
        start = findViewById(R.id.button);
        reset = findViewById(R.id.button3);

        handler = new Handler(Looper.getMainLooper());
    }

    public void BtnStar(View view){
        start_Time = SystemClock.uptimeMillis();
        handler.postDelayed(runnable, 0);
        reset.setEnabled(false);
        stop.setEnabled(true);
        start.setEnabled(false);
    }

    public void BtnStop(View view){
        Time_Buff += milisec1;
        handler.removeCallbacks(runnable);
        reset.setEnabled(true);
        stop.setEnabled(false);
        start.setEnabled(true);
    }
    public void BtnReset(View view){
        milisec1 = 0L;
        start_Time = 0L;
        Time_Buff = 0L;
        Update_Time = 0L;
        secunde = 0;
        milisec = 0;
        minute = 0;
        afisare.setText("00:00:00");
    }

    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            milisec1 = SystemClock.uptimeMillis() - start_Time;
            Update_Time = Time_Buff + milisec1;
            secunde = (int)(Update_Time/1000);
            minute = secunde/60;
            secunde = secunde%60;
            milisec = (int)(Update_Time%1000);
            afisare.setText(MessageFormat.format("{0}:{1}:{2}", minute, String.format(Locale.getDefault(), "%02d", secunde),
                    String.format(Locale.getDefault(),"%02d", milisec)));
            handler.postDelayed(this, 0);
        }
    };
}