package com.example.blackclover.agriculturalequip;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.blackclover.agriculturalequip.Entity.Equip;
import com.example.blackclover.agriculturalequip.utils.AppDatabase;

import java.util.ArrayList;
import java.util.List;

public class EstinateActivity extends AppCompatActivity {

    public static AppDatabase objAppDatabase;

    private Spinner spn;
    private List<String> arrList = new ArrayList<>();
    private Button btnPurchase;

    private CheckBox cbStarter, cbFuelTank, cbAirFilter, cbCarburetor, cbCylinder, cbMuffler,
            cbSwitchOnOff, cbCoil, cbFuelTankCap, cbOilTankCap, cbSparkPlug, cbControlSwitch,
            cbBrushCutterBlade, cbGearDiver, cbMainPipe, cbShaft, cbAirChamber, cbAdjustSet,
            cbDischargeMetal, cbSuctionMetal, cbPistonSet, cbRopeReel, cbPressureGauge, cbPaint;

    private int sum = 0, increaseValue = 0, decreaseValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estinate);

        bindWidget();

        //Get data from database.
        objAppDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "equipmentDB").allowMainThreadQueries().build();

        List<Equip> equipments = EstinateActivity.objAppDatabase.objEquipDAO().getAll();
        arrList.add("กรุณาเลือกอุปกรณ์");
        for (Equip equip : equipments) {
            arrList.add(equip.getEquipname());
        }

        /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array,
                android.R.layout.simple_spinner_item);*/


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(EstinateActivity.this,
                android.R.layout.simple_spinner_item, arrList);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);

        //Set on item selected.
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(EstinateActivity.this, spn.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                List<Equip> oneEquipment = EstinateActivity.objAppDatabase.objEquipDAO().getAll();
                final String selectedItem = String.valueOf(spn.getSelectedItem());

                for (Equip equip : oneEquipment) {

                    if (selectedItem.equals(equip.getEquipname())) {
                        //Check the list of paths.
                        if (equip.getStarter().equals("0")) {
                            cbStarter.setEnabled(false);
                        }

                        if (equip.getFuelTank().equals("0")) {
                            cbFuelTank.setEnabled(false);
                        }

                        if (equip.getAirFilter().equals("0")) {
                            cbAirFilter.setEnabled(false);
                        }

                        if (equip.getCarburetor().equals("0")) {
                            cbCarburetor.setEnabled(false);
                        }

                        if (equip.getCylinder().equals("0")) {
                            cbCylinder.setEnabled(false);
                        }

                        if (equip.getMuffler().equals("0")) {
                            cbMuffler.setEnabled(false);
                        }

                        if (equip.getSwitchOnOff().equals("0")) {
                            cbSwitchOnOff.setEnabled(false);
                        }

                        if (equip.getCoil().equals("0")) {
                            cbCoil.setEnabled(false);
                        }

                        if (equip.getFuelTankCap().equals("0")) {
                            cbFuelTankCap.setEnabled(false);
                        }

                        if (equip.getOilTankCap().equals("0")) {
                            cbOilTankCap.setEnabled(false);
                        }

                        if (equip.getSparkPlug().equals("0")) {
                            cbSparkPlug.setEnabled(false);
                        }

                        if (equip.getControlSwitch().equals("0")) {
                            cbControlSwitch.setEnabled(false);
                        }

                        if (equip.getBrushCutterBlade().equals("0")) {
                            cbBrushCutterBlade.setEnabled(false);
                        }

                        if (equip.getGearDiver().equals("0")) {
                            cbGearDiver.setEnabled(false);
                        }

                        if (equip.getMainPipe().equals("0")) {
                            cbMainPipe.setEnabled(false);
                        }

                        if (equip.getShaft().equals("0")) {
                            cbShaft.setEnabled(false);
                        }

                        if (equip.getAirChamber().equals("0")) {
                            cbAirChamber.setEnabled(false);
                        }

                        if (equip.getAdjustSet().equals("0")) {
                            cbAdjustSet.setEnabled(false);
                        }

                        if (equip.getDischargeMetal().equals("0")) {
                            cbDischargeMetal.setEnabled(false);
                        }

                        if (equip.getSuctionMetal().equals("0")) {
                            cbSuctionMetal.setEnabled(false);
                        }

                        if (equip.getPistonSet().equals("0")) {
                            cbPistonSet.setEnabled(false);
                        }

                        if (equip.getStarterRopeReel().equals("0")) {
                            cbRopeReel.setEnabled(false);
                        }

                        if (equip.getPressureGauge().equals("0")) {
                            cbPressureGauge.setEnabled(false);
                        }

                        if (equip.getPaint().equals("0")) {
                            cbPaint.setEnabled(false);
                        }

                    }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cbStarter:
                //Do something.
                if (cbStarter.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(20);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(20);
                }
                break;
            case R.id.cbFuelTank:
                break;
            case R.id.cbAirFilter:
                break;
            case R.id.cbCarburetor:
                break;
            case R.id.cbCylinder:
                break;
            case R.id.cbMuffler:
                break;
            case R.id.cbSwitchOnOff:
                break;
            case R.id.cbCoil:
                break;
            case R.id.cbFuelTankCap:
                break;
            case R.id.cbOilTankCap:
                break;
            case R.id.cbSparkPlug:
                break;
            case R.id.cbControlSwitch:
                break;
            case R.id.cbBrushCutterBlade:
                break;
            case R.id.cbGearDiver:
                break;
            case R.id.cbMainPipe:
                break;
            case R.id.cbShaft:
                break;
            case R.id.cbAirChamber:
                break;
            case R.id.cbAdjustSet:
                break;
            case R.id.cbDischargeMetal:
                break;
            case R.id.cbSuctionMetal:
                break;
            case R.id.cbPistonSet:
                break;
            case R.id.cbRopeReel:
                break;
            case R.id.cbPressureGauge:
                break;
            case R.id.cbPaint:
                break;
        }
    }

    private int increasePriceCalculation(int increaseValue){
        //Unchecked Checkbox.
        return sum += increaseValue;
    }

    private int decreasePriceCalculation(int decreaseValue) {
        //Checked Checkbox.
        return sum -= decreaseValue;
    }

    private void bindWidget() {
        spn = findViewById(R.id.spinner_list_equip);
        btnPurchase = findViewById(R.id.btnPurchase);

        cbStarter = findViewById(R.id.cbStarter);
        cbFuelTank = findViewById(R.id.cbFuelTank);
        cbAirFilter = findViewById(R.id.cbAirFilter);
        cbCarburetor = findViewById(R.id.cbCarburetor);
        cbCylinder = findViewById(R.id.cbCylinder);
        cbMuffler = findViewById(R.id.cbMuffler);
        cbSwitchOnOff = findViewById(R.id.cbSwitchOnOff);
        cbCoil = findViewById(R.id.cbCoil);
        cbFuelTankCap = findViewById(R.id.cbFuelTankCap);
        cbOilTankCap = findViewById(R.id.cbOilTankCap);
        cbSparkPlug = findViewById(R.id.cbSparkPlug);
        cbControlSwitch = findViewById(R.id.cbControlSwitch);
        cbBrushCutterBlade = findViewById(R.id.cbBrushCutterBlade);
        cbGearDiver = findViewById(R.id.cbGearDiver);
        cbMainPipe = findViewById(R.id.cbMainPipe);
        cbShaft = findViewById(R.id.cbShaft);
        cbAirChamber = findViewById(R.id.cbAirChamber);
        cbAdjustSet = findViewById(R.id.cbAdjustSet);
        cbDischargeMetal = findViewById(R.id.cbDischargeMetal);
        cbSuctionMetal = findViewById(R.id.cbSuctionMetal);
        cbPistonSet = findViewById(R.id.cbPistonSet);
        cbRopeReel = findViewById(R.id.cbRopeReel);
        cbPressureGauge = findViewById(R.id.cbPressureGauge);
        cbPaint = findViewById(R.id.cbShaft);
    }
}
