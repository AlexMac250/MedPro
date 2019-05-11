package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    Button button1;
    Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain12Activity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain9Activity();
            }
        });
    }

    public void openMain9Activity() {
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }

    public void openMain12Activity() {
        Intent intent = new Intent(this, Main12Activity.class);
        startActivity(intent);
    }
}