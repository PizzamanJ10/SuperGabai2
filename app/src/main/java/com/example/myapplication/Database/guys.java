package com.example.myapplication.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "guys")
public class guys {

        /* TODO add shiur

         */

        @ColumnInfo(name = "hadAliyah")
        private boolean hadAliyah;
        @PrimaryKey
        @ColumnInfo(name = "name")
        private String name;
        @ColumnInfo(name = "status")
        private int Status;

        public guys (String nm, int stat, boolean had ){
            this.name = nm;
            this.Status = stat;
            this.hadAliyah = had;
        }


}
