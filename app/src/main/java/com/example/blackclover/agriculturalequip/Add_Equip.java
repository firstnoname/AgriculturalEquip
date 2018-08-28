package com.example.blackclover.agriculturalequip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.blackclover.agriculturalequip.Model.Equipment;

public class Add_Equip extends AppCompatActivity {

    Button btnAdd;
    CheckBox cbStarter,cbFuelTank,cbAirFilter,cbCarburetor,cbCylinder,cbBallValve,cbMuffler,cbSwitchOnOff,cbCoil,cbFuelTankCap,cbOilTankCap,cbSparkPlug,cbControlSwitch,cbBrushCutterBlade,cbGearDiver,cbMainPipe,cbShaft,cbAirChamber,cbAdjustSet,cbDischargeMetal,cbSuctionMetal,cbPistonSet,
    cbStarterRopeReel,cbPressureGauge,cbPaint;
    Equipment objEquip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__equip);

        bindWidget();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMainMenu = new Intent(getApplicationContext(), EstinateActivity.class);
                startActivity(intentMainMenu);
            }
        });
    }

    private void bindWidget() {

    }
}
