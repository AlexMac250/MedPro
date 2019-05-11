package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main13Activity extends AppCompatActivity {

    Button button17;
    Button button18;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain14Activity();
            }
        });
    }

    public void openMain15Activity() {
        Intent intent = new Intent(this, Main15Activity.class);
        startActivity(intent);
    }

    public void openMain14Activity() {
        Intent intent = new Intent(this, Main14Activity.class);
        startActivity(intent);
    }
}