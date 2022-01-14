package com.example.currencey_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    RadioButton rd1,rd2,rd3,rd4,rd5,rd6,rd7,rd8,rd9,rd10;
    TextView tvResult;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.et);
        rd1 = (RadioButton) findViewById(R.id.rd1);
        rd2 = (RadioButton) findViewById(R.id.rd2);
        rd3 = (RadioButton) findViewById(R.id.rd3);
        rd4 = (RadioButton) findViewById(R.id.rd4);
        rd5 = (RadioButton) findViewById(R.id.rd5);
        rd6 = (RadioButton) findViewById(R.id.rd6);
        rd7 = (RadioButton) findViewById(R.id.rd7);
        rd8 = (RadioButton) findViewById(R.id.rd8);
        rd9 = (RadioButton) findViewById(R.id.rd9);
        rd10 = (RadioButton) findViewById(R.id.rd10);
        tvResult = (TextView) findViewById(R.id.tvResult);
        calculate = (Button) findViewById(R.id.calulate);
    }

    public void AM(View view) {
        Intent wlw= new Intent(MainActivity.this,About_Me.class);
        startActivity(wlw);
    }

    public void convert(View view) {
        String s = et.getText().toString();
        double result = Double.parseDouble(s);
        if(rd1.isChecked()){
            result = result * 0.012;
            tvResult.setText(String.valueOf(result));

        }
        else if(rd2.isChecked()){
            result = result * 0.0097;
            tvResult.setText(String.valueOf(result));
        }
        else if(rd3.isChecked()){
            result = result * 0.015;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd4.isChecked()){
            result = result * 0.077;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd5.isChecked()){
            result = result * 0.87;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd6.isChecked()){
            result = result * 0.043;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd7.isChecked()){
            result = result * 0.016;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd8.isChecked()){
            result = result * 0.048;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd9.isChecked()){
            result = result * 0.0036;
            tvResult.setText(String.valueOf(result));
        }
        else if (rd10.isChecked()){
            result = result * 1.89;
            tvResult.setText(String.valueOf(result));
        }
        else {
            Toast.makeText(getApplicationContext(), "Select one option !",Toast.LENGTH_LONG).show();
        }
    }
}