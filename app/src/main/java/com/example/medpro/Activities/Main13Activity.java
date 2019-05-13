package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.R;

public class Main13Activity extends AppCompatActivity {

    Button yes;
    Button no;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
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