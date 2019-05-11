
package com.example.medpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main21Activity extends AppCompatActivity {

    Button button33;
    TextView textView27;
    SeekBar seekBar1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        button33 = (Button) findViewById(R.id.button33);

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain22Activity();
            }
        });
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        textView27 = (TextView) findViewById(R.id.textView27);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {

                textView27.setText(progress + " см");
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