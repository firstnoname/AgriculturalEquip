package com.example.blackclover.agriculturalequip;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.blackclover.agriculturalequip.Entity.Equip;
import com.example.blackclover.agriculturalequip.Entity.Purchase;
import com.example.blackclover.agriculturalequip.utils.AppDatabase;

import java.util.ArrayList;
import java.util.List;

public class EstimateActivity extends AppCompatActivity {

    public static AppDatabase objAppDatabase;

    private Spinner spn;
    private List<String> arrList = new ArrayList<>();
    private Button btnPurchase;
    private EditText edtPurchasePrice, edtNameInfo, edtIdNo;

    private CheckBox cbStarter, cbFuelTank, cbAirFilter, cbCarburetor, cbCylinder, cbMuffler,
            cbSwitchOnOff, cbCoil, cbFuelTankCap, cbOilTankCap, cbSparkPlug, cbControlSwitch,
            cbBrushCutterBlade, cbGearDiver, cbMainPipe, cbShaft, cbAirChamber, cbAdjustSet,
            cbDischargeMetal, cbSuctionMetal, cbPistonSet, cbRopeReel, cbPressureGauge, cbPaint;

    private int sum = 0, increaseValue = 0, decreaseValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimate);

        bindWidget();

        //Get data from database.
        objAppDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "equipmentDB").allowMainThreadQueries().build();

        List<Equip> equipments = EstimateActivity.objAppDatabase.objEquipDAO().getAll();
        arrList.add("กรุณาเลือกอุปกรณ์");
        for (Equip equip : equipments) {
            arrList.add(equip.getEquipname());
        }

        /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array,
                android.R.layout.simple_spinner_item);*/


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(EstimateActivity.this,
                android.R.layout.simple_spinner_item, arrList);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);

        //Set on item selected.
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(EstimateActivity.this, spn.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                List<Equip> oneEquipment = EstimateActivity.objAppDatabase.objEquipDAO().getAll();
                final String selectedItem = String.valueOf(spn.getSelectedItem());

                for (Equip equip : oneEquipment) {

                    if (selectedItem.equals(equip.getEquipname())) {
                        sum = Integer.parseInt(equip.getEquipPrice());
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

        btnPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get value from CheckBox and send to save
                String cusName = String.valueOf(edtNameInfo.getText());
                String cusID = String.valueOf(edtIdNo.getText());
                String cusPurchasePrice = String.valueOf(edtPurchasePrice.getText());

                Purchase objPurchase = new Purchase();

                objPurchase.setCusIdentification(cusID);
                objPurchase.setCusName(cusName);
                objPurchase.setPurchasePrice(cusPurchasePrice);

                EstimateActivity.objAppDatabase.purchaseDAO().insertAll(objPurchase);

                Intent intentMain = new Intent(EstimateActivity.this, MainActivity.class);

                startActivity(intentMain);

                finish();
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
                    decreasePriceCalculation(30);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(30);
                }
                break;
            case R.id.cbFuelTank:
                if (cbFuelTank.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(700);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(700);
                }
                break;
            case R.id.cbAirFilter:
                if (cbAirFilter.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(40);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(40);
                }
                break;
            case R.id.cbCarburetor:
                if (cbCarburetor.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(450);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(450);
                }
                break;
            case R.id.cbCylinder:
                if (cbCylinder.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(2200);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(2200);
                }
                break;
            case R.id.cbMuffler:
                if (cbMuffler.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(160);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(160);
                }
                break;
            case R.id.cbSwitchOnOff:
                if (cbSwitchOnOff.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(120);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(120);
                }
                break;
            case R.id.cbCoil:
                if (cbCoil.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(580);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(580);
                }
                break;
            case R.id.cbFuelTankCap:
                if (cbFuelTankCap.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(50);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(50);
                }
                break;
            case R.id.cbOilTankCap:
                if (cbOilTankCap.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(50);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(50);
                }
                break;
            case R.id.cbSparkPlug:
                if (cbSparkPlug.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(50);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(50);
                }
                break;
            case R.id.cbControlSwitch:
                if (cbControlSwitch.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(160);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(160);
                }
                break;
            case R.id.cbBrushCutterBlade:
                if (cbBrushCutterBlade.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(150);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(150);
                }
                break;
            case R.id.cbGearDiver:
                if (cbGearDiver.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(750);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(750);
                }
                break;
            case R.id.cbMainPipe:
                if (cbMainPipe.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(580);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(580);
                }
                break;
            case R.id.cbShaft:
                if (cbShaft.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(280);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(280);
                }
                break;
            case R.id.cbAirChamber:
                if (cbAirChamber.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(350);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(350);
                }
                break;
            case R.id.cbAdjustSet:
                if (cbAdjustSet.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(580);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(580);
                }
                break;
            case R.id.cbDischargeMetal:
                if (cbDischargeMetal.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(350);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(350);
                }
                break;
            case R.id.cbSuctionMetal:
                if (cbSuctionMetal.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(550);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(550);
                }
                break;
            case R.id.cbPistonSet:
                if (cbPistonSet.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(220);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(220);
                }
                break;
            case R.id.cbRopeReel:
                if (cbRopeReel.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(280);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(280);
                }
                break;
            case R.id.cbPressureGauge:
                if (cbPressureGauge.isChecked()) {
                    //If checked call priceCalculation for decrease price.
                    decreasePriceCalculation(180);
                } else {
                    //If unchecked call priceCalculation for increase price.
                    increasePriceCalculation(180);
                }
                break;
            case R.id.cbPaint:
                if (cbPaint.isChecked()) {
                    decreasePriceCalculation(120);
                } else {
                    increasePriceCalculation(120);
                }
                break;
                default:
        }
    }

    private void increasePriceCalculation(int increaseValue){
        //Unchecked Checkbox.
        sum += increaseValue;
        edtPurchasePrice.setText(sum + "");
    }

    private void decreasePriceCalculation(int decreaseValue) {
        //Checked Checkbox.
        sum -= decreaseValue;
        edtPurchasePrice.setText(sum + "");
    }

    private void bindWidget() {
        spn = findViewById(R.id.spinner_list_equip);
        btnPurchase = findViewById(R.id.btnPurchase);

        edtNameInfo = findViewById(R.id.edt_name_info);
        edtIdNo = findViewById(R.id.edt_id_info);
        edtPurchasePrice = findViewById(R.id.edt_purchase_price);

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
        cbPaint = findViewById(R.id.cbPaint);
    }
}
