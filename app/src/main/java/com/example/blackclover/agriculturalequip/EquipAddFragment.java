package com.example.blackclover.agriculturalequip;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.blackclover.agriculturalequip.Entity.Equip;


/**
 * A simple {@link Fragment} subclass.
 */
public class EquipAddFragment extends Fragment {

    private View view;
    private Button  btnAddEquip;
    private EditText edtName, edtPrice;
    private CheckBox cbStarter, cbFuelTank, cbAirFilter, cbCarburetor, cbCylinder, cbMuffler,
            cbSwitchOnOff, cbCoil, cbFuelTankCap, cbOilTankCap, cbSparkPlug, cbControlSwitch,
            cbBrushCutterBlade, cbGearDiver, cbMainPipe, cbShaft, cbAirChamber, cbAdjustSet,
            cbDischargeMetal, cbSuctionMetal, cbPistonSet, cbRopeReel, cbPressureGauge, cbPaint;

    public EquipAddFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_equip_add, container, false);

        bindWidget();

        btnAddEquip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipName = String.valueOf(edtName.getText());
                String equipPrice = String.valueOf(edtPrice.getText());
                String starter, fuelTank, airFilter, carburetor, cylinder, muffler, switchOnOff,
                        coil, fuelTankCap, oilTankCap, sparkPlug, controlSwitch, brushCutterBlade,
                        gearDiver, mainPipe, shaft, airChamber, adjustSet, dischargeMetal, suctionMetal,
                        pistonSet, ropeReel, pressureGauge, paint;

                if (cbStarter.isChecked()) {
                    starter = String.valueOf(cbStarter.getText());
                } else {
                    starter = "0";
                }

                if (cbFuelTank.isChecked()) {
                    fuelTank = String.valueOf(cbFuelTank.getText());
                } else {
                    fuelTank = "0";
                }

                if (cbAirFilter.isChecked()) {
                    airFilter = String.valueOf(cbAirFilter.getText());
                } else {
                    airFilter = "0";
                }

                if (cbCarburetor.isChecked()) {
                    carburetor = String.valueOf(cbCarburetor.getText());
                } else {
                    carburetor = "0";
                }

                if (cbCylinder.isChecked()) {
                    cylinder = String.valueOf(cbCylinder.getText());
                }else{
                    cylinder = "0";
                }

                if (cbMuffler.isChecked()) {
                    muffler = String.valueOf(cbMuffler.getText());
                } else {
                    muffler = "0";
                }

                if (cbSwitchOnOff.isChecked()) {
                    switchOnOff = String.valueOf(cbSwitchOnOff.getText());
                } else {
                    switchOnOff = "0";
                }

                if (cbCoil.isChecked()) {
                    coil = String.valueOf(cbCoil.getText());
                } else {
                    coil = "0";
                }

                if (cbFuelTankCap.isChecked()) {
                    fuelTankCap = String.valueOf(cbFuelTankCap.getText());
                } else {
                    fuelTankCap = "0";
                }

                if (cbOilTankCap.isChecked()) {
                    oilTankCap = String.valueOf(cbOilTankCap.getText());
                } else {
                    oilTankCap = "0";
                }

                if (cbSparkPlug.isChecked()) {
                    sparkPlug = String.valueOf(cbSparkPlug.getText());
                } else {
                    sparkPlug = "0";
                }

                if (cbControlSwitch.isChecked()) {
                    controlSwitch = String.valueOf(cbControlSwitch.getText());
                } else {
                    controlSwitch = "0";
                }

                if (cbBrushCutterBlade.isChecked()) {
                    brushCutterBlade = String.valueOf(cbBrushCutterBlade.getText());
                } else {
                    brushCutterBlade = "0";
                }

                if (cbGearDiver.isChecked()) {
                    gearDiver = String.valueOf(cbGearDiver.getText());
                } else {
                    gearDiver = "0";
                }

                if (cbMainPipe.isChecked()) {
                    mainPipe = String.valueOf(cbMainPipe.getText());
                } else {
                    mainPipe = "0";
                }

                if (cbShaft.isChecked()) {
                    shaft = String.valueOf(cbShaft.getText());
                } else {
                    shaft = "0";
                }

                if (cbAirChamber.isChecked()) {
                    airChamber = String.valueOf(cbAirChamber.getText());
                } else {
                    airChamber = "0";
                }

                if (cbAdjustSet.isChecked()) {
                    adjustSet = String.valueOf(cbAdjustSet.getText());
                } else {
                    adjustSet = "0";
                }

                if (cbDischargeMetal.isChecked()) {
                    dischargeMetal = String.valueOf(cbDischargeMetal.getText());
                } else {
                    dischargeMetal = "0";
                }

                if (cbSuctionMetal.isChecked()) {
                    suctionMetal = String.valueOf(cbSuctionMetal.getText());
                } else {
                    suctionMetal = "0";
                }

                if (cbPistonSet.isChecked()) {
                    pistonSet = String.valueOf(cbPistonSet.getText());
                } else {
                    pistonSet = "0";
                }

                if (cbRopeReel.isChecked()) {
                    ropeReel = String.valueOf(cbRopeReel.getText());
                } else {
                    ropeReel = "0";
                }

                if (cbPressureGauge.isChecked()) {
                    pressureGauge = String.valueOf(cbPressureGauge.getText());
                } else {
                    pressureGauge = "0";
                }

                if (cbPaint.isChecked()) {
                    paint = String.valueOf(cbPaint.getText());
                } else {
                    paint = "0";
                }

                Equip objEquipment = new Equip();
                objEquipment.setEquipname(equipName);
                objEquipment.setEquipPrice(equipPrice);
                objEquipment.setStarter(starter);
                objEquipment.setFuelTank(fuelTank);
                objEquipment.setAirFilter(airFilter);
                objEquipment.setCarburetor(carburetor);
                objEquipment.setCylinder(cylinder);
                objEquipment.setMuffler(muffler);
                objEquipment.setSwitchOnOff(switchOnOff);
                objEquipment.setCoil(coil);
                objEquipment.setFuelTankCap(fuelTankCap);
                objEquipment.setOilTankCap(oilTankCap);
                objEquipment.setSparkPlug(sparkPlug);
                objEquipment.setControlSwitch(controlSwitch);
                objEquipment.setBrushCutterBlade(brushCutterBlade);
                objEquipment.setGearDiver(gearDiver);
                objEquipment.setMainPipe(mainPipe);
                objEquipment.setShaft(shaft);
                objEquipment.setAirChamber(airChamber);
                objEquipment.setAdjustSet(adjustSet);
                objEquipment.setDischargeMetal(dischargeMetal);
                objEquipment.setSuctionMetal(suctionMetal);
                objEquipment.setPistonSet(pistonSet);
                objEquipment.setStarterRopeReel(ropeReel);
                objEquipment.setPressureGauge(pressureGauge);
                objEquipment.setPaint(paint);

                Equip_Main_Activity.objAppDatabase.objEquipDAO().insertAll(objEquipment);
                Toast.makeText(getActivity(), equipName + " has ben added. ", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

    private void bindWidget() {
        btnAddEquip = view.findViewById(R.id.btnPurchase);

        edtName = view.findViewById(R.id.txt_name);
        edtPrice = view.findViewById(R.id.txt_price);

        cbStarter = view.findViewById(R.id.cbStarter);
        cbFuelTank = view.findViewById(R.id.cbFuelTank);
        cbAirFilter = view.findViewById(R.id.cbAirFilter);
        cbCarburetor = view.findViewById(R.id.cbCarburetor);
        cbCylinder = view.findViewById(R.id.cbCylinder);
        cbMuffler = view.findViewById(R.id.cbMuffler);
        cbSwitchOnOff = view.findViewById(R.id.cbSwitchOnOff);
        cbCoil = view.findViewById(R.id.cbCoil);
        cbFuelTankCap = view.findViewById(R.id.cbFuelTankCap);
        cbOilTankCap = view.findViewById(R.id.cbOilTankCap);
        cbSparkPlug = view.findViewById(R.id.cbSparkPlug);
        cbControlSwitch = view.findViewById(R.id.cbControlSwitch);
        cbBrushCutterBlade = view.findViewById(R.id.cbBrushCutterBlade);
        cbGearDiver = view.findViewById(R.id.cbGearDiver);
        cbMainPipe = view.findViewById(R.id.cbMainPipe);
        cbShaft = view.findViewById(R.id.cbShaft);
        cbAirChamber = view.findViewById(R.id.cbAirChamber);
        cbAdjustSet = view.findViewById(R.id.cbAdjustSet);
        cbDischargeMetal = view.findViewById(R.id.cbDischargeMetal);
        cbSuctionMetal = view.findViewById(R.id.cbSuctionMetal);
        cbPistonSet = view.findViewById(R.id.cbPistonSet);
        cbRopeReel = view.findViewById(R.id.cbRopeReel);
        cbPressureGauge = view.findViewById(R.id.cbPressureGauge);
        cbPaint = view.findViewById(R.id.cbShaft);
    }

}
