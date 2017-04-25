package com.example.jonathan.paylockbackroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Logbootsin extends AppCompatActivity {

    private Button bStaffLogBoots;
    private EditText etBootLogin;
    private EditText etBootCondition;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mConditionRef = mRootRef.child("condition");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logbootsin);

        bStaffLogBoots = (Button)findViewById(R.id.bStaffLogBoots);
        etBootLogin = (EditText)findViewById(R.id.etBootLogin);
        etBootCondition = (EditText)findViewById(R.id.etBootCondition);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mConditionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        })
    }
}
