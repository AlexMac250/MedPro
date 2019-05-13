package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.R;

public class Main15Activity extends AppCompatActivity {

    Button yes;
    Button no;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain17Activity();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
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