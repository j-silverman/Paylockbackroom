package com.example.jonathan.paylockbackroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by Jonathan on 4/7/2017.
 */
public class Managerlogin extends AppCompatActivity{
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.managerlogin);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.5));

    }
    public void managerui(View view){
        this.view = view;

        Intent intent = new Intent(Managerlogin.this, ManagerUI.class);
        startActivity(intent);

    }
}
