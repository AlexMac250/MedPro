package com.example.medpro;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;

public class Main2Activity extends Activity {

    Button information;
    Button checkup_of_mammary_glands;
    TextView output_id_entered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        output_id_entered = (TextView) findViewById(R.id.output_id_entered);
        output_id_entered.setText(getIntent().getStringExtra("ID")); // textView для id

        information = (Button) findViewById(R.id.information); // кнопка
        checkup_of_mammary_glands = (Button) findViewById(R.id.checkup_of_mammary_glands);

        checkup_of_mammary_glands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain4Activity();
            }
        });

        information.setOnClickListener(new View.OnClickListener() {
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