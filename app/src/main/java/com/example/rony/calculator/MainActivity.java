package com.example.rony.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView result;
        EditText num1, num2;
        Button add,sub,mul,div;

        float temp,a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);

        add = findViewById(R.id.sum);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.mult);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(num1.getText().toString());
                b = Float.parseFloat(num2.getText().toString());

                temp = a + b;

                result.setText(String.valueOf(temp));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(num1.getText().toString());
                b = Float.parseFloat(num2.getText().toString());

                temp = a - b;

                result.setText(String.valueOf(temp));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(num1.getText().toString());
                b = Float.parseFloat(num2.getText().toString());

                temp = a * b;

                result.setText(String.valueOf(temp));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(num1.getText().toString());
                b = Float.parseFloat(num2.getText().toString());

                temp = a / b;

                result.setText(String.valueOf(temp));
            }
        });
    }
}
