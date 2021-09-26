package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public void clickFunctionSum(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextNum1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.editTextNum2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());
        int result = number1 + number2;
        String res = String.valueOf(result);
        goToActivity2(res);
    }
    public void clickFunctionMinus(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextNum1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.editTextNum2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());
        int result = number1 - number2;
        String res = String.valueOf(result);
        goToActivity2(res);
    }
    public void clickFunctionMultiply(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextNum1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.editTextNum2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());
        int result = number1*number2;
        String res = String.valueOf(result);
        goToActivity2(res);
    }
    public void clickFunctionDivide(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextNum1);
        int number1 = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.editTextNum2);
        int number2 = Integer.parseInt(myTextField2.getText().toString());
        int result = number1/number2;
        String res = String.valueOf(result);
        goToActivity2(res);
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}