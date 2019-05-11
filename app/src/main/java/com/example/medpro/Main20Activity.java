package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main20Activity extends AppCompatActivity {

    Button button31;
    Button button32;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        button31 = (Button) findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain21Activity();
            }
        });


        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain25Activity();
            }
        });
    }

    public void openMain21Activity() {
        Intent intent = new Intent(this, Main21Activity.class);
        startActivity(intent);
    }

    public void openMain25Activity() {
        Intent intent = new Intent(this, Main25Activity.class);
        startActivity(intent);
    }
}