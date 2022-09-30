package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class save extends AppCompatActivity {
    private Button read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        read=(Button)findViewById(R.id.read);
        read.setOnClickListener(((view)->{readon();}));
    }

    private void readon() {
        Intent intent = new Intent(this, read.class);
        startActivity(intent);
    }

}