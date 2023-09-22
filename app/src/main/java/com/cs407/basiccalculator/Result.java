package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Result extends AppCompatActivity {

    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        if(str.equals("Infinity")){
            textView.setText("Denominator can't be 0");
        }else {
            textView.setText(str);
        }
    }
}