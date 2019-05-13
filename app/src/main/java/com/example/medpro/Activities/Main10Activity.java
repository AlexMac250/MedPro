package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.R;

public class Main10Activity extends AppCompatActivity {


    Button ok;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        ok = (Button) findViewById(R.id.fuzzy_rough);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain18Activity();
            }
        });
    }

    public void openMain18Activity()
    {
        Intent intent = new Intent(this, Main18Activity.class);
        startActivity(intent);
    }
}