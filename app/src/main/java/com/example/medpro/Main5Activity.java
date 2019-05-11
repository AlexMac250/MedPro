package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imageButton2;
    Button button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        button3 = (Button) findViewById(R.id.button3);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain7Activity();
            }
        });
    }
    public void openMain13Activity()
    {
        Intent intent = new Intent(this, Main13Activity.class);
        startActivity(intent);
    }

    public void openMain7Activity()
    {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }
}