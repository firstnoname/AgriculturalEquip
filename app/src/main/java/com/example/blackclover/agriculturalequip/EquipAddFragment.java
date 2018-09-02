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
            cbBrushCutterBlade, cbGearDiver, cbMainPipi, cbShaft, cbAirChamber, cbAdjustSet,
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

                if (cbStarter.isChecked()) {
                    String starter = String.valueOf(cbStarter.getText());
                } else {

                }

                if (cbFuelTank.isChecked()) {
                    String fuelTank = String.valueOf(cbFuelTank.getText());
                } else {

                }

                if (cbAirFilter.isChecked()) {
                    String airFilter = String.valueOf(cbAirFilter.getText());
                } else {

                }

                if (cbCarburetor.isChecked()) {
                    String carburetor = String.valueOf(cbCarburetor.getText());
                } else {

                }

                if (cbCylinder.isChecked()) {
                    String cylinder = String.valueOf(cbCylinder.getText());
                }else{

                }

                if (cbMuffler.isChecked()) {
                    String muffler = String.valueOf(cbMuffler.getText());
                } else {

                }

                if (cbSwitchOnOff.isChecked()) {
                    String switchOnOff = String.valueOf(cbSwitchOnOff.getText());
                } else {

                }

                if (cbCoil.isChecked()) {
                    String coil = String.valueOf(cbCoil.getText());
                } else {

                }

                if (cbFuelTankCap.isChecked()) {
                    String fuelTankCap = String.valueOf(cbFuelTankCap.getText());
                } else {

                }

                if (cbOilTankCap.isChecked()) {
                    String oilTankCap = String.valueOf(cbOilTankCap.getText());
                } else {

                }

                if (cbSparkPlug.isChecked()) {
                    String sparkPlug = String.valueOf(cbSparkPlug.getText());
                } else {

                }

                if (cbControlSwitch.isChecked()) {
                    String controlSwitch = String.valueOf(cbControlSwitch.getText());
                } else {

                }

                if (cbBrushCutterBlade.isChecked()) {
                    String brushCutterBlade = String.valueOf(cbBrushCutterBlade.getText());
                } else {

                }

                if (cbGearDiver.isChecked()) {
                    String gearDiver = String.valueOf(cbGearDiver.getText());
                } else {

                }

                if (cbMainPipi.isChecked()) {
                    String mainPipe = String.valueOf(cbMainPipi.getText());
                } else {

                }

                if (cbShaft.isChecked()) {
                    String shaft = String.valueOf(cbShaft.getText());
                } else {

                }

                if (cbAirChamber.isChecked()) {
                    String airChamber = String.valueOf(cbAirChamber.getText());
                } else {

                }

                if (cbAdjustSet.isChecked()) {
                    String adjustSet = String.valueOf(cbAdjustSet.getText());
                } else {

                }

                if (cbDischargeMetal.isChecked()) {
                    String dischargeMetal = String.valueOf(cbDischargeMetal.getText());
                } else {

                }

                if (cbSuctionMetal.isChecked()) {
                    String suctionMetal = String.valueOf(cbSuctionMetal.getText());
                } else {

                }

                if (cbPistonSet.isChecked()) {
                    String pistonSet = String.valueOf(cbPistonSet.getText());
                } else {

                }

                if (cbRopeReel.isChecked()) {
                    String ropeReel = String.valueOf(cbRopeReel.getText());
                } else {

                }

                if (cbPressureGauge.isChecked()) {
                    String pressureGauge = String.valueOf(cbPressureGauge.getText());
                } else {

                }

                if (cbPaint.isChecked()) {
                    String paint = String.valueOf(cbPaint.getText());
                } else {

                }

                Equip objEquipment = new Equip();
                objEquipment.setEquipname(equipName);
                objEquipment.setEquipPrice(equipPrice);

                Equip_Main_Activity.objAppDatabase.objEquipDAO().insertAll(objEquipment);
                Toast.makeText(getActivity(), "Equipment has ben added", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

    private void bindWidget() {
        btnAddEquip = view.findViewById(R.id.btnAddEquip);

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
        cbMainPipi = view.findViewById(R.id.cbMainPipe);
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
