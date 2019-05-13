package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.R;

public class Main22Activity extends AppCompatActivity {

    Button left;
    Button both;
    Button right;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        left = (Button) findViewById(R.id.left);
        both = (Button) findViewById(R.id.both);
        right = (Button) findViewById(R.id.right);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain23Activity();
            }
        });

        both.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain23Activity();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
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