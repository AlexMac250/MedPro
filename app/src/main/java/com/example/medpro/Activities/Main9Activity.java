package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.example.medpro.Main;
import com.example.medpro.R;

public class Main9Activity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void openMain5Activity() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void openMain17Activity() {
        Intent intent = new Intent(this, Main17Activity.class);
        startActivity(intent);
    }

    //breast development

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String answer;
        switch (v.getId()) {
            case R.id.inborn:
            case R.id.postoperative:
            case R.id.injury:
                answer = button.getText().toString();
                Main.profile.breast_development_cause = answer;
                openMain5Activity();
                break;
            case R.id.tumor:
                answer = button.getText().toString();
                Main.profile.breast_development_cause = answer;
                Main.profile.breast_development_deformation_type = "other";
                openMain17Activity();
                break;
        }
    }
}