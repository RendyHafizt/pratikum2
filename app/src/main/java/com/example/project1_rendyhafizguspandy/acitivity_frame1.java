package com.example.project1_rendyhafizguspandy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class acitivity_frame1 extends AppCompatActivity {
    ImageView gambarLoading;
    Animation rotasiAnimasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity_frame1);
        gambarLoading = findViewById(R.id.loading);
        rotasi();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(acitivity_frame1.this,acitivity_frame2.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
    private void rotasi(){
        rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
        gambarLoading.startAnimation(rotasiAnimasi);
    }
}