package com.example.blackclover.agriculturalequip;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class EquipMenuFragment extends Fragment implements View.OnClickListener {

    private Button btnAddEquip, btnListEquip, btnDeleteEquip;


    public EquipMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_equip_menu, container, false);

        btnAddEquip = view.findViewById(R.id.btn_add_equip);
        btnAddEquip.setOnClickListener(this);

        btnListEquip = view.findViewById(R.id.btn_list_equip);
        btnListEquip.setOnClickListener(this);

        btnDeleteEquip = view.findViewById(R.id.btn_delete_equip);
        btnDeleteEquip.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_equip:
                Equip_Main_Activity.fragmentManager.beginTransaction().replace(R.id.fragment_container,
                        new EquipAddFragment()).commit();
                break;
            case R.id.btn_list_equip:
                Equip_Main_Activity.fragmentManager.beginTransaction().replace(R.id.fragment_container,
                        new EquipListFragment()).commit();
                break;
            case R.id.btn_delete_equip:
                Equip_Main_Activity.fragmentManager.beginTransaction().replace(R.id.fragment_container,
                        new EquipDeleteFragment()).commit();
        }
    }
}
