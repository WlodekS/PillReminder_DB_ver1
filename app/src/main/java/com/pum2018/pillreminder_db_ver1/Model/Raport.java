package com.pum2018.pillreminder_db_ver1.Model;

import android.provider.BaseColumns;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Wlodek on 2018-03-07.
 */

public class Raport implements BaseColumns {
    private String medicine_Name;
    private Date date;
    private Time plannedTime;
    private Time actualTime;

    // Constructors:

    public Raport() {
    }

    public Raport(String medicine_Name, Date date, Time plannedTime, Time actualTime) {
        this.medicine_Name = medicine_Name;
        this.date = date;
        this.plannedTime = plannedTime;
        this.actualTime = actualTime;
    }

    //Getters and Setters:
    public String getMedicine_Name() {
        return medicine_Name;
    }

    public void setMedicine_Name(String medicine_Name) {
        this.medicine_Name = medicine_Name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getPlannedTime() {
        return plannedTime;
    }

    public void setPlannedTime(Time plannedTime) {
        this.plannedTime = plannedTime;
    }

    public Time getActualTime() {
        return actualTime;
    }

    public void setActualTime(Time actualTime) {
        this.actualTime = actualTime;
    }
}
