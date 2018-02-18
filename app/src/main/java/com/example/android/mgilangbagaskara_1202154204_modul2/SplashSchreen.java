package com.example.android.mgilangbagaskara_1202154204_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashSchreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_schreen);
        //Toast toast = Toast.makeText(this, "M GILANG BAGASKARA_1202154204", Toast.LENGTH_LONG);
        //toast.show();

        final Handler handler = new Handler(); // buat splahschreen agar langsung pindah ke activity ke 2
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MenuUtama.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
