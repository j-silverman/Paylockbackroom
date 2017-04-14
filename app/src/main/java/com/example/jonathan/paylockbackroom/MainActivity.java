package com.example.jonathan.paylockbackroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView register = (TextView) findViewById(R.id.tvRegister);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }

    public void sendMessage(View view){

        Intent intent = new Intent(MainActivity.this, Managerlogin.class);
        startActivity(intent);

    }
    public void sendMessage1(View view){

        Intent intent = new Intent(MainActivity.this, Stafflogin.class);
        startActivity(intent);

    }
}

