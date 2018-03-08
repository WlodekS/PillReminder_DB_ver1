package com.pum2018.pillreminder_db_ver1.Model;

import android.provider.BaseColumns;


/**
 * Created by Wlodek on 2018-03-07.
 */

public class Store implements BaseColumns {
    private int medicine_id;
    private int quantity;

    // Constructors:
    public Store() {
    }

    public Store(int medicine_id, int quantity) {
        this.medicine_id = medicine_id;
        this.quantity = quantity;
    }

    //Getters and Setters:
    public void setMedicine_id(int medicine_id) {
        medicine_id = medicine_id;
    }

    public void setQuantity(int quantity) {
        quantity = quantity;
    }

    public int getMedicine_id() {
        return medicine_id;
    }

    public int getQuantity() {
        return quantity;
    }
}
