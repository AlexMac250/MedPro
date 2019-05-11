package com.example.medpro;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent; // подключаем класс Intent
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View; // подключаем класс View для обработки нажатия кнопки
import android.widget.Button;
import android.widget.EditText; // подключаем класс EditText
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText ID;
    private Button act_change1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ID = findViewById(R.id.ID);
        act_change1 = findViewById(R.id.act_change1);

        ID.addTextChangedListener(loginTextWatcher);
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String IDInput = ID.getText().toString().trim();

            act_change1.setEnabled(!IDInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };

    public void sendData(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("ID", ID.getText().toString());
        startActivity(intent);
    }

}
