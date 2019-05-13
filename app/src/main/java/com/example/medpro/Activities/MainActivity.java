package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent; // подключаем класс Intent
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View; // подключаем класс View для обработки нажатия кнопки
import android.widget.Button;
import android.widget.EditText; // подключаем класс EditText

import com.example.medpro.Main;
import com.example.medpro.Profile;
import com.example.medpro.R;


public class MainActivity extends AppCompatActivity {

    private EditText exitTextID;
    private Button buttonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitTextID = findViewById(R.id.ID);
        buttonEnter = findViewById(R.id.enter);

        exitTextID.addTextChangedListener(loginTextWatcher);
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            buttonEnter.setEnabled(!exitTextID.getText().toString().trim().isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {}
    };

    public void sendData(View view) {
        String id = exitTextID.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("exitTextID", id);
        Main.profile = new Profile(id);
        startActivity(intent);
    }

}
