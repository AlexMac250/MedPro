package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.R;

public class Main14Activity extends AppCompatActivity {

    Button coarsegrained;
    Button finegrained;
    Button lobed;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        coarsegrained = (Button) findViewById(R.id.coarsegrained);
        finegrained = (Button) findViewById(R.id.finegrained);
        lobed = (Button) findViewById(R.id.lobed);

        coarsegrained.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });

        finegrained.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain15Activity();
            }
        });

        lobed.setOnClickListener(new View.OnClickListener() {
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