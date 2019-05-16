package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.medpro.Main;
import com.example.medpro.R;

public class Main25Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = findViewById(R.id.textViewProfileDebug2);
        textView.setText(Main.profile.toString());
        setContentView(R.layout.activity_main25);
    }
}
