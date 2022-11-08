package com.example.project1_rendyhafizguspandy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearAcitivy3 extends AppCompatActivity {

    String kepada;
    String sbjk;
    String pesan;
    EditText eKepada;
    EditText ePesan;
    EditText eSubyek;
    Button bkirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_acitivy3);
        kepada = getIntent().getExtras().getString("kepada");
        sbjk = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");

        eKepada = findViewById(R.id.kepadaa);
        eSubyek = findViewById(R.id.subyekk);
        ePesan = findViewById(R.id.pesann);
        bkirim = findViewById(R.id.kirim);

        eKepada.setText(kepada);
        eSubyek.setText(sbjk);
        ePesan.setText(pesan);
    }
}