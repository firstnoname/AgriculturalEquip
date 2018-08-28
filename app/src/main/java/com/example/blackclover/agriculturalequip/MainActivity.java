package com.example.blackclover.agriculturalequip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddEquipt = findViewById(R.id.btnAddEquip);
        Button btnEsitmate = findViewById(R.id.btn_menu_estimate);

        btnAddEquipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to insert new equipment.
                Intent intentAddEquip = new Intent(getApplicationContext(), Add_Equip.class);
                startActivity(intentAddEquip);
            }
        });

        btnEsitmate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenuEstimate = new Intent(getApplicationContext(), EstinateActivity.class);
                startActivity(intentMenuEstimate);
            }
        });
    }


}
