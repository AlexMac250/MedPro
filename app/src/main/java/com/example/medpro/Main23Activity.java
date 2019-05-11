package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main23Activity extends AppCompatActivity {

    Button single_duct;
    Button many_ducts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        single_duct = findViewById(R.id.single_duct);
        many_ducts = findViewById(R.id.many_ducts);

        single_duct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain24Activity();
            }
        });

        many_ducts.setOnClickListener(new View.OnClickListener() {
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