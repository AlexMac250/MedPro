package com.example.medpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main17Activity extends AppCompatActivity {

    Button button7;
    TextView textView22;
    SeekBar seekBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        button7 = (Button) findViewById(R.id.button7);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView22 = (TextView) findViewById(R.id.textView22);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain10Activity();
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView22.setText(progress + " см");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
        public void openMain10Activity() {
            Intent intent = new Intent(this, Main10Activity.class);
            startActivity(intent);
        }
    }
