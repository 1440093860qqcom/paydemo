package com.example.paydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.paylibrary.Pay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pay.add(1, 2);
    }
}
