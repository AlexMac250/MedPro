package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main16Activity extends AppCompatActivity {

    Button ok;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        ok = (Button) findViewById(R.id.fuzzy_rough);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });
    }
    public void openMain13Activity()
    {
        Intent intent = new Intent(this, Main13Activity.class);
        startActivity(intent);
    }
}