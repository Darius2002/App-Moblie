package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter batteryChanged = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        MyBroadcast batteryChangedReceiver = new MyBroadcast();
        registerReceiver(batteryChangedReceiver, batteryChanged);


        IntentFilter batteryLow = new IntentFilter(Intent.ACTION_BATTERY_LOW);
        MyBroadcast batteryLowReceiver = new MyBroadcast();
        registerReceiver(batteryLowReceiver, batteryLow);

    }
}