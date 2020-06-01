package com.example.gismuseumdibali;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    private final int panjangSplash = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splashscreen);
        new Handler ().postDelayed (new Runnable () {
            @Override
            public void run() {
                Intent tampil = new Intent(Splashscreen.this,MainActivity.class);
                Splashscreen.this.startActivity (tampil);
                Splashscreen.this.finish ();
            }
        },panjangSplash);

    }
}
