package com.example.jonathan.paylockbackroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManagerUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_ui);
    }
    public void sendMessage2(View view){

        Intent intent = new Intent(ManagerUI.this, Checkprod.class);
        startActivity(intent);

    }
    public void sendMessage3(View view) {

        Intent intent = new Intent(ManagerUI.this, Emptyracks.class);
        startActivity(intent);
    }
    public void sendMessage4(View view) {

        Intent intent = new Intent(ManagerUI.this, Incomingboots.class);
        startActivity(intent);
    }
}

