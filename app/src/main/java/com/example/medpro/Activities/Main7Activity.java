package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

import com.example.medpro.Main;
import com.example.medpro.R;

public class Main7Activity extends AppCompatActivity {

    ImageButton right_missing;
    ImageButton left_missing;
    ImageButton both_missing;
    Button more;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        right_missing = (ImageButton) findViewById(R.id.right_missing);
        left_missing = (ImageButton) findViewById(R.id.left_missing);
        both_missing = (ImageButton) findViewById(R.id.both_missing);
        more = (Button) findViewById(R.id.more);

        right_missing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main.profile.breast_development_deformation_other_type = "right_missing";
                openMain13Activity();
            }
        });
        left_missing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main.profile.breast_development_deformation_other_type = "left_missing";
                openMain13Activity();
            }
        });
        both_missing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main.profile.breast_development_deformation_other_type = "both_missing";
                openMain13Activity();
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain8Activity();
            }
        });
    }
        public void openMain13Activity ()
        {
            Intent intent = new Intent(this, Main13Activity.class);
            startActivity(intent);
        }

        public void openMain8Activity ()
        {
            Intent intent = new Intent(this, Main8Activity.class);
            startActivity(intent);
        }
}