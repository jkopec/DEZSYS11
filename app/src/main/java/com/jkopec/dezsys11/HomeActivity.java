package com.jkopec.dezsys11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

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

        //Displays welcome Message
        TextView welcome_text = (TextView) findViewById(R.id.welcome_text);
        welcome_text.setText(getIntent().getStringExtra("welcome_text"));

    }

}