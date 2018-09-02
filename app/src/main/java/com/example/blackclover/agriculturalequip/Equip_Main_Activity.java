package com.example.blackclover.agriculturalequip;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Equip_Main_Activity extends AppCompatActivity {

    public static android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip__main_);

        fragmentManager = getSupportFragmentManager();

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            fragmentManager.beginTransaction().add(R.id.fragment_container, new EquipMenuFragment()).commit();

        }
    }
}
