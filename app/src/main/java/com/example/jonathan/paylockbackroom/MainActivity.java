package com.example.jonathan.Paylockbackroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvRegister;

    private Button bManager;
    private Button bStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRegister = (TextView) findViewById(R.id.tvRegister);
        bManager = (Button) findViewById(R.id.bManager);
        bStaff = (Button) findViewById(R.id.bStaff);

        tvRegister.setOnClickListener(this);
        bManager.setOnClickListener(this);
        bStaff.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v == tvRegister){
            startActivity(new Intent(this, RegisterActivity.class));
        }
        if(v == bManager){
            startActivity(new Intent(this, Managerlogin.class));
        }
        if(v == bStaff){
            startActivity(new Intent(this, Stafflogin.class));
        }

    }
}

