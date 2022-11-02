package com.example.project1_rendyhafizguspandy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class acitivity_frame2 extends AppCompatActivity {
    EditText eUsername;
    ImageButton bLogin;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity_frame2);

        eUsername = findViewById(R.id.username);
        bLogin = findViewById(R.id.login);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { login();}
        });
    }
    public void login () {
        user = eUsername.getText().toString();

        Intent intent = new Intent( acitivity_frame2.this,LinearActivity2.class);
        intent.putExtra("user",user);
        Toast.makeText(this,"Selamat Datang"+user,Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}