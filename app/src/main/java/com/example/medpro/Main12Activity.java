package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main12Activity extends AppCompatActivity {

    Button button15;
    Button button16;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain5Activity();
            }
        });
    }

    public void openMain13Activity() {
        Intent intent = new Intent(this, Main13Activity.class);
        startActivity(intent);
    }

    public void openMain5Activity() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
}