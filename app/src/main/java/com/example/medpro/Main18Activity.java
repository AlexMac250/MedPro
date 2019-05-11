package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main18Activity extends AppCompatActivity {

    Button elastic;
    Button symptom_of_area;
    Button dense_elastic;
    Button symptom_of_extension;
    Button fluctuation;
    Button softening;
    Button dense;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        elastic = (Button) findViewById(R.id.elastic);
        symptom_of_area = (Button) findViewById(R.id.symptom_of_area);
        dense_elastic = (Button) findViewById(R.id.dense_elastic);
        symptom_of_extension = (Button) findViewById(R.id.symptom_of_extension);
        fluctuation = (Button) findViewById(R.id.fluctuation);
        softening = (Button) findViewById(R.id.softening);
        dense = (Button) findViewById(R.id.dense);

        elastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });

        symptom_of_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });

        dense_elastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });

        symptom_of_extension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });

        fluctuation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });

        softening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });

        dense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain19Activity();
            }
        });
    }

    public void openMain19Activity() {
        Intent intent = new Intent(this, Main19Activity.class);
        startActivity(intent);
    }
}