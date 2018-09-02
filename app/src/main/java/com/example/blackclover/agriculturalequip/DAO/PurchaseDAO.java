package com.example.blackclover.agriculturalequip.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.blackclover.agriculturalequip.Entity.Purchase;

import java.util.List;

/**
 * Created by BlackClover on 9/2/2018.
 */

@Dao
public interface PurchaseDAO {
    @Query("SELECT * FROM purchases")
    List<Purchase> getAll();

    @Insert
    void insertAll(Purchase... purchases);

    @Delete
    void delete(Purchase purchase);
}
