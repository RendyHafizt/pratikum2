package com.example.project1_rendyhafizguspandy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user;
    EditText eKepada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);

        user = getIntent().getExtras().getString("user");

        eKepada = findViewById(R.id.kepada);

        eKepada.setText(user);
    }
}