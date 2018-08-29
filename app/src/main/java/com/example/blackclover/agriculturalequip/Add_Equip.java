package com.example.blackclover.agriculturalequip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.blackclover.agriculturalequip.Model.Equipment;

public class Add_Equip extends AppCompatActivity {

    Button btnAdd;

    EditText edt_name;

    CheckBox cbStarter,cbFuelTank,cbAirFilter,cbCarburetor,cbCylinder,cbBallValve,cbMuffler,cbSwitchOnOff,cbCoil,cbFuelTankCap,cbOilTankCap,cbSparkPlug,cbControlSwitch,cbBrushCutterBlade,cbGearDiver,cbMainPipe,cbShaft,cbAirChamber,cbAdjustSet,cbDischargeMetal,cbSuctionMetal,cbPistonSet,
    cbStarterRopeReel,cbPressureGauge,cbPaint;

    Equipment objEquip;

    String equip_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_equip);

        bindWidget();
        
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equip_name = String.valueOf(edt_name.getText());

                Toast.makeText(Add_Equip.this, "Add " + equip_name + " success.",
                        Toast.LENGTH_SHORT).show();

                Intent intentToMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentToMain);
            }
        });

    }

    private void bindWidget() {
        btnAdd = findViewById(R.id.btnAdd);
        edt_name = findViewById(R.id.txt_name);
    }
}
