package com.example.android.mgilangbagaskara_1202154204_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MenuListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);
//        recyclerView.addOnItemTouchListener(new RecycleView.Item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Lele Cabe Hijau", 20000, R.drawable.lelesj, "Lele Cabe Hijau + Nasi"));
        data.add(new MenuModel("Lele Crispy", 25000, R.drawable.lelecrsy, "Lele Crispy + Nasi"));
        data.add(new MenuModel("Lele Cabe Merah", 24000, R.drawable.lelemrh, "Lele Cabe Merah + Nasi"));
        data.add(new MenuModel("Lele Pindang", 30000, R.drawable.lelepindang, "Lele Pindang + Nasi"));
        data.add(new MenuModel("Lele Tumis", 29000, R.drawable.leletms, "Lele Tumis + Nasi"));
        data.add(new MenuModel("Lele Nuget", 15000, R.drawable.lelengt, "Lele Nuget + Nasi. Olahan Ikan Lele sangkuriang asli "));

        return data;
    }
}

