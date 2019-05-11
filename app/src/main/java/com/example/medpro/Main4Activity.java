package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    Button yes;
    Button no;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain12Activity();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
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