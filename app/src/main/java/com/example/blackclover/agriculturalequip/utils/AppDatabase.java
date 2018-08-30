package com.example.blackclover.agriculturalequip.utils;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.blackclover.agriculturalequip.DAO.EquipDAO;
import com.example.blackclover.agriculturalequip.Entity.Equip;

@Database(entities = {Equip.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EquipDAO objEquipDAO();
}
