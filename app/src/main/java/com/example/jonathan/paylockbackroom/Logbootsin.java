package com.example.jonathan.Paylockbackroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Logbootsin extends AppCompatActivity implements View.OnClickListener{

    Button bStaffLogBoots;
    EditText etBootLogin;
    EditText etBootCondition;
    String bootnum, bootcond, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logbootsin);

        bStaffLogBoots = (Button)findViewById(R.id.bStaffLogBoots);
        etBootLogin = (EditText)findViewById(R.id.etBootLogin);
        etBootCondition = (EditText)findViewById(R.id.etBootCondition);
        bStaffLogBoots.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == bStaffLogBoots){
            String bootnum = etBootLogin.getText().toString();
            String bootcond = etBootCondition.getText().toString();
            String date = "2017-04-28";
            String type = "logBoots";
            logBootsInBackground logBootsInBackground = new logBootsInBackground(this);
            logBootsInBackground.execute(type, bootnum, bootcond, date);
        }
    }
}
