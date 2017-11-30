package com.example.antons.translationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pageOne = findViewById(R.id.numbers);
        pageOne.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent openFirstPage = new Intent(MainActivity.this, FirstPage.class);
                        startActivity(openFirstPage);
                    }
                }
        );

        TextView pageTwo = findViewById(R.id.date);
        pageTwo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent openSecondPage = new Intent(MainActivity.this, SecondPageActivity.class);
                        startActivity(openSecondPage);
                    }
                }
        );


    }




    }



