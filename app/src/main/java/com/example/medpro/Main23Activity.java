package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main23Activity extends AppCompatActivity {

    Button button37;
    Button button38;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain24Activity();
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain24Activity();
            }
        });
    }

    public void openMain24Activity() {
        Intent intent = new Intent(this, Main24Activity.class);
        startActivity(intent);
    }
}