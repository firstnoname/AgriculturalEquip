package com.example.blackclover.agriculturalequip;


import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.blackclover.agriculturalequip.Entity.Equip;
import com.example.blackclover.agriculturalequip.utils.AppDatabase;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EstimateAddFragment extends Fragment {

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

    public EstimateAddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_estimate_add, container, false);

        bindWidget(view);

        List<Equip> equipments = EstimateAddFragment.objAppDatabase.objEquipDAO().getAll();
        arrList.add("กรุณาเลือกอุปกรณ์");

        for (Equip equip : equipments) {
            arrList.add(equip.getEquipname());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, arrList);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);


        return view;
    }

    private void bindWidget(View view) {
        spn = view.findViewById(R.id.spinner_list_equip);
        btnPurchase = view.findViewById(R.id.btnPurchase);

        edtNameInfo = view.findViewById(R.id.edt_name_info);
        edtIdNo = view.findViewById(R.id.edt_id_info);
        edtPurchasePrice = view.findViewById(R.id.edt_purchase_price);

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
        cbPaint = view.findViewById(R.id.cbPaint);
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


}
