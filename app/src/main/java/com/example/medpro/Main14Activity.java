package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main14Activity extends AppCompatActivity {

    Button button21;
    Button button22;
    Button button23;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });
    }

    public void openMain15Activity() {
        Intent intent = new Intent(this, Main15Activity.class);
        startActivity(intent);
    }
}