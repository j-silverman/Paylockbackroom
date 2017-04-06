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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){

        Intent intent = new Intent(MainActivity.this, ManagerUI.class);
        startActivity(intent);

    }
    public void sendMessage1(View view){

        Intent intent = new Intent(MainActivity.this, StaffUI.class);
        startActivity(intent);

    }
}

