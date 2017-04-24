package com.example.jonathan.paylockbackroom;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Jonathan on 4/7/2017.
 */
public class Stafflogin extends AppCompatActivity implements View.OnClickListener{
    private Button bStaffLogin;
    private EditText etStaffEmail;
    private EditText etStaffPassword;

    private FirebaseAuth firebaseAuth;

    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.stafflogin);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.4));
        etStaffEmail = (EditText) findViewById(R.id.etStaffEmail);
        etStaffPassword = (EditText) findViewById(R.id.etStaffPassword);
        bStaffLogin = (Button) findViewById(R.id.bStaffLogin);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()!= null){
            finish();
            startActivity(new Intent(getApplicationContext(),StaffUI.class));
        }
        progressDialog = new ProgressDialog(this);

        bStaffLogin.setOnClickListener(this);
    }
    private void staffLogin(){
        String email = etStaffEmail.getText().toString().trim();
        String password = etStaffPassword.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter Password", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Logging in...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(getApplicationContext(),StaffUI.class));

                        }
                    }
                });
    }
    //public void staffui(View view){
      //  this.view = view;

        //Intent intent = new Intent(Stafflogin.this, StaffUI.class);
        //startActivity(intent);

    //}

    @Override
    public void onClick(View v) {
        if(v == bStaffLogin){
            staffLogin();
        }
    }
}