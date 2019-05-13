package com.example.medpro.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.medpro.R;

public class Main17Activity extends AppCompatActivity {

    Button ok;
    TextView output_nodal_size;
    SeekBar node_size_from_1_to_6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        ok = (Button) findViewById(R.id.fuzzy_rough);
        node_size_from_1_to_6 = (SeekBar) findViewById(R.id.node_size_from_1_to_6);
        output_nodal_size = (TextView) findViewById(R.id.output_nodal_size);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain10Activity();
            }
        });

        node_size_from_1_to_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                output_nodal_size.setText(progress + " см");
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
