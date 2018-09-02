package com.example.blackclover.agriculturalequip;

import android.app.FragmentManager;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.blackclover.agriculturalequip.utils.AppDatabase;

public class Equip_Main_Activity extends AppCompatActivity {

    public static android.support.v4.app.FragmentManager fragmentManager;
    public static AppDatabase objAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip__main_);

        fragmentManager = getSupportFragmentManager();
        objAppDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "equipmentDB").allowMainThreadQueries().build();

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            fragmentManager.beginTransaction().add(R.id.fragment_container, new EquipMenuFragment()).commit();

        }
    }
}
