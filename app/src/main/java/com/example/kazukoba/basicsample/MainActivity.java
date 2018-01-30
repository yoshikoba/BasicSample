package com.example.kazukoba.basicsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.buttonStart);
        startButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this,"test",Toast.LENGTH_LONG).show();
    }
}
