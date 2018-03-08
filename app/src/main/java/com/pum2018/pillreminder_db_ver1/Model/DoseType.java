package com.pum2018.pillreminder_db_ver1.Model;

import android.provider.BaseColumns;

/**
 * Created by Wlodek on 2018-03-07.
 */

public class DoseType implements BaseColumns{
    private String name;

    //Constructors:
    public DoseType() {
    }
    public DoseType(String name) {
        this.name = name;
    }


    //Getters and Settes:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
