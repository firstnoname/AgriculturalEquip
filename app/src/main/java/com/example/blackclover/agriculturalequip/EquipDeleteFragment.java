package com.example.blackclover.agriculturalequip;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.blackclover.agriculturalequip.Entity.Equip;


/**
 * A simple {@link Fragment} subclass.
 */
public class EquipDeleteFragment extends Fragment {

    private EditText edtNameDelete;
    private Button btnDelete;

    public EquipDeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_equip_delete, container, false);

        edtNameDelete = view.findViewById(R.id.edt_delete_name);
        btnDelete = view.findViewById(R.id.btn_delete);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(edtNameDelete.getText().toString());
                Equip equip = new Equip();
                equip.setId_equip(id);
                Equip_Main_Activity.objAppDatabase.objEquipDAO().delete(equip);

                Toast.makeText(getActivity(), "Equipment has been delete.", Toast.LENGTH_SHORT).show();

                //Back to equip menu.

            }
        });

        return view;
    }

}
