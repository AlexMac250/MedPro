package com.example.medpro.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;

import com.example.medpro.R;

public class Main6Activity extends AppCompatActivity {

    Button confirm;
/*    CheckBox lymph_node1;
    CheckBox lymph_node2;
    CheckBox lymph_node3;
    CheckBox lymph_node4;
    CheckBox lymph_node5;
    CheckBox lymph_node6;
    CheckBox lymph_node7;
    CheckBox lymph_node8;
    CheckBox lymph_node9;
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        confirm = (Button) findViewById(R.id.confirm);
        /*
        lymph_node1 = (CheckBox) findViewById(R.id.lymph_node1);
        lymph_node2 = (CheckBox) findViewById(R.id.lymph_node2);
        lymph_node3 = (CheckBox) findViewById(R.id.lymph_node3);
        lymph_node4 = (CheckBox) findViewById(R.id.lymph_node4);
        lymph_node5 = (CheckBox) findViewById(R.id.lymph_node5);
        lymph_node6 = (CheckBox) findViewById(R.id.lymph_node6);
        lymph_node7 = (CheckBox) findViewById(R.id.lymph_node8);
        lymph_node8 = (CheckBox) findViewById(R.id.lymph_node8);
        lymph_node9 = (CheckBox) findViewById(R.id.lymph_node9);
*/


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openMain11Activity();
            }
        });
    }

        public void openMain11Activity ()
        {
            Intent intent = new Intent(this, Main11Activity.class);
            startActivity(intent);
        }
}
