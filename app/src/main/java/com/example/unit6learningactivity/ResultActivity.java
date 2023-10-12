package com.example.unit6learningactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textViewResult;
    Double length, width, mathTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = (TextView) findViewById(R.id.textViewResult);
        Bundle extras = getIntent().getExtras();
        length = extras.getDouble("length");
        width = extras.getDouble("width");
        mathTotal = extras.getDouble("mathTotal");
        textViewResult.setText("The width is " + width + " and the length is " + length + " and the total flooring needed is " + mathTotal);



    }
}