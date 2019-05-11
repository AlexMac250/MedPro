package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main20Activity extends AppCompatActivity {

    Button yes;
    Button no;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain21Activity();
            }
        });


        no.setOnClickListener(new View.OnClickListener() {
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