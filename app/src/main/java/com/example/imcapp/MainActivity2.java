package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewResult = (TextView) findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        Float imc = intent.getFloatExtra("imcresult", 0);

        textViewResult.setText(imc.toString());
    }
}