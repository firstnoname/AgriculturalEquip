package com.example.blackclover.agriculturalequip.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Equip {
    @PrimaryKey
    private int id_equip;

    @ColumnInfo(name = "")
    private String starter;

    @ColumnInfo(name = "")
    private String fuelTank;
}
