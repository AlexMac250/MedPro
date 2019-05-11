package com.example.medpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;

public class Main2Activity extends Activity {

    Button act_change2;
    Button act_change3;
    TextView txtID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtID = (TextView) findViewById(R.id.txtID);
        txtID.setText(getIntent().getStringExtra("ID")); // textView для id

        act_change2 = (Button) findViewById(R.id.act_change2);
        act_change3 = (Button) findViewById(R.id.act_change3);

        act_change3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain4Activity();
            }
        });

        act_change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain3Activity();
            }
        });
    }

    public void openMain4Activity() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void openMain3Activity() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}