package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main19Activity extends AppCompatActivity {

    Button button27;
    Button button28;
    Button button29;
    Button button30;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        button27 = (Button) findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });
    }

    public void openMain20Activity() {
        Intent intent = new Intent(this, Main20Activity.class);
        startActivity(intent);
    }
}