package com.example.blackclover.agriculturalequip;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.blackclover.agriculturalequip.Entity.Equip;
import com.example.blackclover.agriculturalequip.Entity.Purchase;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EquipListFragment extends Fragment {

    private TextView txtInfo;

    public EquipListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_equip_list, container, false);
        txtInfo = view.findViewById(R.id.txt_display_equip_info);

        List<Equip> equipments = Equip_Main_Activity.objAppDatabase.objEquipDAO().getAll();
        List<Purchase> purchases = Equip_Main_Activity.objAppDatabase.purchaseDAO().getAll();

        String equipInfo = "";

        for (Equip equip : equipments) {
            int equipId = equip.getId_equip();
            String equipName = equip.getEquipname();
            String equipPrice = equip.getEquipPrice();
            String starter = equip.getStarter();

            equipInfo = equipInfo+"\n\n" + "Id : " + equipId + "\n" +
                    "Equip name : " + equipName + "\n" +
                    "Equip price : " + equipPrice + "\n" +
                    "Starter : " + starter;
        }

        for (Purchase purchase : purchases) {
            int id = purchase.getPurchase_id();
            String cusName = purchase.getCusName();
            String purchasePrice = purchase.getPurchasePrice();

            equipInfo = "\n\n" + "Id : " + id + "\n" +
                    "Customer name : " + cusName + "\n" +
                    "Purchase price : " + purchasePrice + "\n" +
                    "Size : " + purchases.size();
        }

        txtInfo.setText(equipInfo);

        return view;
    }

}
