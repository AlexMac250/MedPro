
package com.example.medpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main21Activity extends AppCompatActivity {

    Button ok;
    TextView output_of_degree;
    SeekBar degree_of_discharge_from_1_to_3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        ok = (Button) findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain22Activity();
            }
        });
        degree_of_discharge_from_1_to_3 = (SeekBar) findViewById(R.id.degree_of_discharge_from_1_to_3);
        output_of_degree = (TextView) findViewById(R.id.output_of_degree);

        degree_of_discharge_from_1_to_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {

                output_of_degree.setText(progress + " см");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void openMain22Activity() {
        Intent intent = new Intent(this, Main22Activity.class);
        startActivity(intent);
    }
}