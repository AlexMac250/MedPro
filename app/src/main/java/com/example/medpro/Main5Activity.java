package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {

    ImageButton left_bigger_right;
    ImageButton right_bigger_left;
    Button more;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        left_bigger_right = (ImageButton) findViewById(R.id.left_bigger_right);
        right_bigger_left = (ImageButton) findViewById(R.id.right_bigger_left);
        more = (Button) findViewById(R.id.more);

        left_bigger_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });

        right_bigger_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain13Activity();
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
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