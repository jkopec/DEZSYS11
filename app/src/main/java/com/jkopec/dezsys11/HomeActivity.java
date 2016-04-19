package com.jkopec.dezsys11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 *
 * Home Screen Activity
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);
    }

}