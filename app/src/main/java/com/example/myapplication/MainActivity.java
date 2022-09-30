package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText etinput;
    private TextView textout;

    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etinput = findViewById(R.id.etinput);
        Button button = findViewById(R.id.button);
        textout = findViewById(R.id.textout);
        ImageView dog = findViewById(R.id.dog);
        button.setOnClickListener(((view) -> getinputtocat()));
        dog.setOnClickListener(((view) -> at()));


    }

    private void getinputtocat() {
        textout.setText(etinput.getText());
        etinput.setText("");


    }

    private void at() {
        Intent intent = new Intent(this, save.class);
        startActivity(intent);

    }
}
