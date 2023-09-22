package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText firstInteger=(EditText) findViewById(R.id.firstInteger);
        EditText secondInteger=(EditText) findViewById(R.id.secondInteger);
        double integer1=Integer.parseInt(firstInteger.getText().toString());
        double integer2=Integer.parseInt(secondInteger.getText().toString());
        double result=integer1+integer2;
        String finalResult=String.valueOf(result);
        goToActivity(finalResult);
    }
    public void sub(View view){
        EditText firstInteger=(EditText) findViewById(R.id.firstInteger);
        EditText secondInteger=(EditText) findViewById(R.id.secondInteger);
        double integer1=Integer.parseInt(firstInteger.getText().toString());
        double integer2=Integer.parseInt(secondInteger.getText().toString());
        double result=integer1-integer2;
        String finalResult=String.valueOf(result);
        goToActivity(finalResult);
    }
    public void mul(View view){
        EditText firstInteger=(EditText) findViewById(R.id.firstInteger);
        EditText secondInteger=(EditText) findViewById(R.id.secondInteger);
        double integer1=Integer.parseInt(firstInteger.getText().toString());
        double integer2=Integer.parseInt(secondInteger.getText().toString());
        double result=integer1*integer2;
        String finalResult=String.valueOf(result);
        goToActivity(finalResult);
    }
    public void div(View view){
        EditText firstInteger=(EditText) findViewById(R.id.firstInteger);
        EditText secondInteger=(EditText) findViewById(R.id.secondInteger);
        double integer1=Integer.parseInt(firstInteger.getText().toString());
        double integer2=Integer.parseInt(secondInteger.getText().toString());
        double result=integer1/integer2;
        String finalResult=String.valueOf(result);
        goToActivity(finalResult);
    }



    public void goToActivity(String s){
        Intent intent=new Intent(this, Result.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}