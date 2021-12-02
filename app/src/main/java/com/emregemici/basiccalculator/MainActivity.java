package com.emregemici.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNum1);
        number2 = findViewById(R.id.editTextNum2);
        resultText= findViewById(R.id.textViewResult);
    }


    public void sum(View view){

        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
         resultText.setText("Please Enter A Value");
        }
        else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            int result = num1 + num2;
            resultText.setText("Result : " + result);
        }

    }
    public void sub(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            resultText.setText("Please Enter A Value");
        }
        else {
            int result = 0;
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            if(num2>=num1){
                result= num2-num1;
            }
            else{
                result= num1-num2;
            }

            resultText.setText("Result : "+result);
        }


    }
    public void multi(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            resultText.setText("Please Enter A Value");
        }
        else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            int result = num1 * num2;
            resultText.setText("Result : " + result);
        }
    }
    public void div(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultText.setText("Please Enter A Value");
        } else
        {
            double result = 0;
        double num1 = Double.parseDouble(number1.getText().toString());
        double num2 = Double.parseDouble(number2.getText().toString());
        result = num1 / num2;
        resultText.setText("Result : " + result);
        }
    }
}