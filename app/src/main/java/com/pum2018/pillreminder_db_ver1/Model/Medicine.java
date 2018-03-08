package com.pum2018.pillreminder_db_ver1.Model;

import android.provider.BaseColumns;

/**
 * Created by Wlodek on 2018-03-07.
 */

public class Medicine implements BaseColumns{
    private String name;

    // Constructors:
    public Medicine() {
    }

    public Medicine(String name) {
        this.name = name;
    }

    // Getter and Setter:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
