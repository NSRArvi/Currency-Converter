package com.example.currencey_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class About_Me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__me);
        setTitle("About me");
    }

    public void onBackPressed() {
        Intent intent = new Intent(About_Me.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}