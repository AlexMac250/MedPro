package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.R;

public class Main12Activity extends AppCompatActivity {

    Button yes;
    Button no;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
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