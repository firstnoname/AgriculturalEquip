package com.example.blackclover.agriculturalequip.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "purchases")
public class Purchase {

    @PrimaryKey(autoGenerate = true)
    private int purchase_id;

    @ColumnInfo(name = "cus_name")
    private String cusName;

    @ColumnInfo(name = "cus_identification")
    private String cusIdentification;

    @ColumnInfo(name = "purchase_price")
    private String purchasePrice;

    @ColumnInfo(name = "equip_name")
    private String equipname;

    @ColumnInfo(name = "equip_price")
    private String equipPrice;

    @ColumnInfo(name = "starter")
    private String starter;

    @ColumnInfo(name = "fuel_tank")
    private String fuelTank;

    @ColumnInfo(name = "air_filter")
    private String airFilter;

    @ColumnInfo(name = "carburetor")
    private String carburetor;

    @ColumnInfo(name = "cylinder")
    private String cylinder;

    @ColumnInfo(name = "ball_valve_switch_oil")
    private String ballValveSwitchOil;

    @ColumnInfo(name = "muffler")
    private String muffler;

    @ColumnInfo(name = "switch_on_off")
    private String switchOnOff;

    @ColumnInfo(name = "coil")
    private String coil;

    @ColumnInfo(name = "fuel_tank_cap")
    private String fuelTankCap;

    @ColumnInfo(name = "oil_tank_cap")
    private String oilTankCap;

    @ColumnInfo(name = "spark_plug")
    private String sparkPlug;

    @ColumnInfo(name = "control_switch")
    private String controlSwitch;

    @ColumnInfo(name = "brush_cutter_blade")
    private String brushCutterBlade;

    @ColumnInfo(name = "gear_diver")
    private String gearDiver;

    @ColumnInfo(name = "main_pipe")
    private String mainPipe;

    @ColumnInfo(name = "shaft")
    private String shaft;

    @ColumnInfo(name = "air_chamber")
    private String airChamber;

    @ColumnInfo(name = "adjust_set")
    private String adjustSet;

    @ColumnInfo(name = "discharge_metal")
    private String dischargeMetal;

    @ColumnInfo(name = "suction_metal")
    private String suctionMetal;

    @ColumnInfo(name = "piston_set")
    private String pistonSet;

    @ColumnInfo(name = "starter_rope_reel")
    private String starterRopeReel;

    @ColumnInfo(name = "pressure_gauge")
    private String pressureGauge;

    @ColumnInfo(name = "paint")
    private String paint;

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusIdentification() {
        return cusIdentification;
    }

    public void setCusIdentification(String cusIdentification) {
        this.cusIdentification = cusIdentification;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname;
    }

    public String getEquipPrice() {
        return equipPrice;
    }

    public void setEquipPrice(String equipPrice) {
        this.equipPrice = equipPrice;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(String fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getAirFilter() {
        return airFilter;
    }

    public void setAirFilter(String airFilter) {
        this.airFilter = airFilter;
    }

    public String getCarburetor() {
        return carburetor;
    }

    public void setCarburetor(String carburetor) {
        this.carburetor = carburetor;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }

    public String getBallValveSwitchOil() {
        return ballValveSwitchOil;
    }

    public void setBallValveSwitchOil(String ballValveSwitchOil) {
        this.ballValveSwitchOil = ballValveSwitchOil;
    }

    public String getMuffler() {
        return muffler;
    }

    public void setMuffler(String muffler) {
        this.muffler = muffler;
    }

    public String getSwitchOnOff() {
        return switchOnOff;
    }

    public void setSwitchOnOff(String switchOnOff) {
        this.switchOnOff = switchOnOff;
    }

    public String getCoil() {
        return coil;
    }

    public void setCoil(String coil) {
        this.coil = coil;
    }

    public String getFuelTankCap() {
        return fuelTankCap;
    }

    public void setFuelTankCap(String fuelTankCap) {
        this.fuelTankCap = fuelTankCap;
    }

    public String getOilTankCap() {
        return oilTankCap;
    }

    public void setOilTankCap(String oilTankCap) {
        this.oilTankCap = oilTankCap;
    }

    public String getSparkPlug() {
        return sparkPlug;
    }

    public void setSparkPlug(String sparkPlug) {
        this.sparkPlug = sparkPlug;
    }

    public String getControlSwitch() {
        return controlSwitch;
    }

    public void setControlSwitch(String controlSwitch) {
        this.controlSwitch = controlSwitch;
    }

    public String getBrushCutterBlade() {
        return brushCutterBlade;
    }

    public void setBrushCutterBlade(String brushCutterBlade) {
        this.brushCutterBlade = brushCutterBlade;
    }

    public String getGearDiver() {
        return gearDiver;
    }

    public void setGearDiver(String gearDiver) {
        this.gearDiver = gearDiver;
    }

    public String getMainPipe() {
        return mainPipe;
    }

    public void setMainPipe(String mainPipe) {
        this.mainPipe = mainPipe;
    }

    public String getShaft() {
        return shaft;
    }

    public void setShaft(String shaft) {
        this.shaft = shaft;
    }

    public String getAirChamber() {
        return airChamber;
    }

    public void setAirChamber(String airChamber) {
        this.airChamber = airChamber;
    }

    public String getAdjustSet() {
        return adjustSet;
    }

    public void setAdjustSet(String adjustSet) {
        this.adjustSet = adjustSet;
    }

    public String getDischargeMetal() {
        return dischargeMetal;
    }

    public void setDischargeMetal(String dischargeMetal) {
        this.dischargeMetal = dischargeMetal;
    }

    public String getSuctionMetal() {
        return suctionMetal;
    }

    public void setSuctionMetal(String suctionMetal) {
        this.suctionMetal = suctionMetal;
    }

    public String getPistonSet() {
        return pistonSet;
    }

    public void setPistonSet(String pistonSet) {
        this.pistonSet = pistonSet;
    }

    public String getStarterRopeReel() {
        return starterRopeReel;
    }

    public void setStarterRopeReel(String starterRopeReel) {
        this.starterRopeReel = starterRopeReel;
    }

    public String getPressureGauge() {
        return pressureGauge;
    }

    public void setPressureGauge(String pressureGauge) {
        this.pressureGauge = pressureGauge;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }
}
