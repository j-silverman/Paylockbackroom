package com.example.jonathan.paylockbackroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StaffUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_ui);
    }
    public void sendMessage5(View view) {

        Intent intent = new Intent(StaffUI.this, Checksched.class);
        startActivity(intent);
    }
    public void sendMessage6(View view) {

        Intent intent = new Intent(StaffUI.this, Logbootsin.class);
        startActivity(intent);
    }
    public void sendMessage7(View view) {

        Intent intent = new Intent(StaffUI.this, Fixedboots.class);
        startActivity(intent);
    }
    public void sendMessage8(View view) {

        Intent intent = new Intent(StaffUI.this, Checkpprod.class);
        startActivity(intent);
    }
}
