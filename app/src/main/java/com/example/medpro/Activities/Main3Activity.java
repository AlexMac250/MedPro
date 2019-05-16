package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.medpro.Main;
import com.example.medpro.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_info);
        ((TextView) findViewById(R.id.textViewProfileDebug)).setText(Main.profile.toString());
    }
}
