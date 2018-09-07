package com.example.blackclover.agriculturalequip;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.blackclover.agriculturalequip.Entity.Purchase;
import com.example.blackclover.agriculturalequip.utils.AppDatabase;

import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    public static AppDatabase objAppDatabase;

    private TextView txtListPurchase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        objAppDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "purchaseDB").allowMainThreadQueries().build();

        List<Purchase> purchases = HistoryActivity.objAppDatabase.purchaseDAO().getAll();

        txtListPurchase = findViewById(R.id.txt_display_purchase_info);

        String purchaseInfo = "";
        purchaseInfo = String.valueOf(purchases.size());
        for (Purchase purchase : purchases) {
//            Log.d("purchases", "test");

            int purchaseID = purchase.getPurchase_id();
            String cusName = purchase.getCusName();
            String cusId = purchase.getCusIdentification();
            String purchasePrice = purchase.getPurchasePrice();

            purchaseInfo = purchaseInfo + "\n\n" + "ID : " + cusId + "\n" +
                    "Customer name : " + cusName + "\n" +
                    "Purchased price : " + purchasePrice;
        }

        txtListPurchase.setText(purchaseInfo);


    }
}
