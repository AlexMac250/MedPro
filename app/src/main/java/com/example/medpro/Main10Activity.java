package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main10Activity extends AppCompatActivity {


    Button button11;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        button11 = (Button) findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
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