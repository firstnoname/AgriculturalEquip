package com.example.blackclover.agriculturalequip.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.blackclover.agriculturalequip.Entity.Equip;

import java.util.List;

@Dao
public interface EquipDAO {
    @Query("SELECT * FROM equipments")
    List<Equip> getAll();

    @Query("SELECT * FROM equipments WHERE id_equip IN (:equipIds)")
    List<Equip> loadAllByIds(int[] equipIds);

    @Query("SELECT * FROM equipments WHERE equip_name LIKE :equipname")
    Equip findByName(String equipname);

    @Insert
    void insertAll(Equip... equips);

    @Delete
    void delete(Equip equip);
}
