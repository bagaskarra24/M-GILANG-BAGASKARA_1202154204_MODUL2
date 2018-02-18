package com.example.android.mgilangbagaskara_1202154204_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    private RadioGroup radgro;
    private ProgressBar proba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        proba=(ProgressBar) findViewById(R.id.pbm);
        proba.setVisibility(View.INVISIBLE);
       radgro = (RadioGroup) findViewById(R.id.radioPilihMenu);
        Toast.makeText(this,"M.GILANG BAGASKARA_1202154204",Toast.LENGTH_LONG).show(); //memunculkan toast setelah splashschreen
    }

    public void PesanSekarang(View view){ // untuk mengaktifkan tombol button

        proba.setVisibility(View.VISIBLE); // untuk mengakifkan progress bar

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                proba.setVisibility(View.INVISIBLE);
                pencet();
            }
        }, 1000L); // 1 detik

    }

    public void pencet(){ // mengaktifkan radio button
        int go = radgro.getCheckedRadioButtonId();
        switch (go){
            case R.id.takeawayradio:
                Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TakeAway.class)); break;
            case R.id.dineinradio:
                Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,DineIn.class)); break;
            default:break;
        }
    }
}
