package com.example.mysmileyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SmileyView smileyView;
    Button button;
    SmileyView smileyView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smileyView = new SmileyView(this);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        smileyView2 = findViewById(R.id.smileyView);
    }


    @Override
    public void onClick(View v) {

        smileyView2.invalidate();
    }
}
