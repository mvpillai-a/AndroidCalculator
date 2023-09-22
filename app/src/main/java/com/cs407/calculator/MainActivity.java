package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAdd(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.firstNumber)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.secondNumber)).getText().toString());
        goToActivity(num1+num2);
    }

    public void onSubtract(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.firstNumber)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.secondNumber)).getText().toString());
        goToActivity(num1-num2);
    }

    public void onMultiply(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.firstNumber)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.secondNumber)).getText().toString());
        goToActivity(num1*num2);
    }

    public void onDivide(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.firstNumber)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.secondNumber)).getText().toString());
        if(num2 == 0){
            Toast.makeText(this, "Cannot divide by 0", Toast.LENGTH_LONG).show();
            return;
        }
        goToActivity(num1/(float)num2);
    }

    public void goToActivity(float ans){
        Intent intent = new Intent(this, Answer.class);
        intent.putExtra("answer",""+ans);
        startActivity(intent);
    }
}