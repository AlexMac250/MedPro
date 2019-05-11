package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main19Activity extends AppCompatActivity {

    Button clear_smooth;
    Button fuzzy_smooth;
    Button clear_rough;
    Button fuzzy_rough;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        clear_smooth = (Button) findViewById(R.id.clear_smooth);
        fuzzy_smooth = (Button) findViewById(R.id.fuzzy_smooth);
        clear_rough = (Button) findViewById(R.id.clear_rough);
        fuzzy_rough = (Button) findViewById(R.id.fuzzy_rough);

        clear_smooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });

        fuzzy_smooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });

        clear_rough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain20Activity();
            }
        });

        fuzzy_rough.setOnClickListener(new View.OnClickListener() {
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