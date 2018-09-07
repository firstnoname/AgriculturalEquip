package com.example.blackclover.agriculturalequip;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.blackclover.agriculturalequip.utils.AppDatabase;

public class EstimateMainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static AppDatabase objAppdatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimate_main);

        fragmentManager = getSupportFragmentManager();

        objAppdatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "purchaseDB").allowMainThreadQueries().build();

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {

            }

            fragmentManager.beginTransaction().add(R.id.fragment_container, new EstimateMenuFragment()).commit();
        }
    }
}
