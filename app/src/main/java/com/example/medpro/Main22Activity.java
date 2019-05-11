package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main22Activity extends AppCompatActivity {

    Button button34;
    Button button35;
    Button button36;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain23Activity();
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain23Activity();
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain23Activity();
            }
        });
    }

    public void openMain23Activity() {
        Intent intent = new Intent(this, Main23Activity.class);
        startActivity(intent);
    }
}