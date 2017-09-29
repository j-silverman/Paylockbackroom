package com.example.jonathan.Paylockbackroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkprod extends AppCompatActivity implements View.OnClickListener {
    private Button bManagerCheckProd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkprod);
        bManagerCheckProd = (Button) findViewById(R.id.bManagerCheckProd);
    }

    @Override
    public void onClick(View v) {
        if(v == bManagerCheckProd){
        }
    }
}
