package com.example.jonathan.Paylockbackroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StaffUI extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    private Button bStaffLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_ui);

        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() == null){
            startActivity(new Intent(this, MainActivity.class));
        }
        FirebaseUser user = firebaseAuth.getCurrentUser();
        bStaffLogout = (Button) findViewById(R.id.bStaffLogout);
        bStaffLogout.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(v==bStaffLogout){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }

    }
}
