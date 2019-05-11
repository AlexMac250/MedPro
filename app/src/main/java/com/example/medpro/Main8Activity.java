package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Main8Activity extends AppCompatActivity {

    ImageButton n_numbers_of_breast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        n_numbers_of_breast = (ImageButton) findViewById(R.id.n_numbers_of_breast);

        n_numbers_of_breast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain16Activity();
            }
        });
    }
    public void openMain16Activity ()
    {
        Intent intent = new Intent(this, Main16Activity.class);
        startActivity(intent);
    }
}