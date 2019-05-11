package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main15Activity extends AppCompatActivity {

    Button button24;
    Button button25;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain17Activity();
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain6Activity();
            }
        });
    }

    public void openMain17Activity() {
        Intent intent = new Intent(this, Main17Activity.class);
        startActivity(intent);
    }

    public void openMain6Activity() {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
}