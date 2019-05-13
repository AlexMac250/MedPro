package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;

import com.example.medpro.Main;
import com.example.medpro.R;

public class Main16Activity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBoxLeft;
    CheckBox checkBoxLeftDown;
    CheckBox checkBoxCenter;
    CheckBox checkBoxRightDown;
    CheckBox checkBoxRight;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        checkBoxLeft = findViewById(R.id.glandLeft);
        checkBoxLeftDown = findViewById(R.id.glandLeftDown);
        checkBoxCenter = findViewById(R.id.glandCenter);
        checkBoxRightDown = findViewById(R.id.glandRightDown);
        checkBoxRight = findViewById(R.id.glandRight);
    }
    public void openMain13Activity()
    {
        Intent intent = new Intent(this, Main13Activity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.glandLeft:
                Main.profile.extension_of_the_mammary_glands_left = checkBoxLeft.isChecked();
                break;
            case R.id.glandLeftDown:
                Main.profile.extension_of_the_mammary_glands_leftDown = checkBoxLeftDown.isChecked();
                break;
            case R.id.glandCenter:
                Main.profile.extension_of_the_mammary_glands_center = checkBoxCenter.isChecked();
                break;
            case R.id.glandRightDown:
                Main.profile.extension_of_the_mammary_glands_rightDown = checkBoxRightDown.isChecked();
                break;
            case R.id.glandRight:
                Main.profile.extension_of_the_mammary_glands_right = checkBoxRight.isChecked();
                break;
            case R.id.fuzzy_rough:
                openMain13Activity();
                break;
        }
    }
}