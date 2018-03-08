package com.pum2018.pillreminder_db_ver1.Model;

import android.provider.BaseColumns;

import java.sql.Time;

/**
 * Created by Wlodek on 2018-03-07.
 */

public class Taking implements BaseColumns{
    private int medicine_id;
    private int dose;
    private int doseType_id;
    private Time time;

    // Constructors:

    public Taking() {
    }

    public Taking(int medicine_id, int dose, int doseType_id, Time time) {
        this.medicine_id = medicine_id;
        this.dose = dose;
        this.doseType_id = doseType_id;
        this.time = time;
    }

    /* Getter and Setter */

    public int getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(int medicine_id) {
        this.medicine_id = medicine_id;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public int getDoseType_id() {
        return doseType_id;
    }

    public void setDoseType_id(int doseType_id) {
        this.doseType_id = doseType_id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
