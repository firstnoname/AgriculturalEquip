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
public class EstimateMenuFragment extends Fragment implements View.OnClickListener {

    private Button btnEstimate, btnListEstimated;


    public EstimateMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_estimate_menu, container, false);

        btnEstimate = view.findViewById(R.id.btn_estimate);
        btnEstimate.setOnClickListener(this);
        btnListEstimated = view.findViewById(R.id.btn_list_estimated);
        btnListEstimated = view.findViewById(R.id.btn_list_estimated);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_estimate:
                EstimateMainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,
                        new EstimateAddFragment()).commit();
                break;
            case R.id.btn_list_estimated:

        }
    }
}
