package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main9Activity extends AppCompatActivity {


    Button inborn;
    Button postoperative;
    Button injury;
    Button tumor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        inborn = (Button) findViewById(R.id.inborn);
        postoperative = (Button) findViewById(R.id.postoperative);
        injury = (Button) findViewById(R.id.injury);
        tumor = (Button) findViewById(R.id.tumor);

        inborn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });

        postoperative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });


        injury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });

        tumor.setOnClickListener(new View.OnClickListener() {
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