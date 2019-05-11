package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main9Activity extends AppCompatActivity {


    Button button5;
    Button button6;
    Button button8;
    Button button9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain17Activity();
            }
        });
    }
    public void openMain5Activity()
    {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void openMain17Activity()
    {
        Intent intent = new Intent(this, Main17Activity.class);
        startActivity(intent);
    }
}