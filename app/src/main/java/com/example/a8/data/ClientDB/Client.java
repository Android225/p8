package com.example.a8.data.ClientDB;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Client {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "clientId")
    public int clientId;
    @ColumnInfo(name = "name")
    public String name;
    public Client() {}
    public Client(String name) {
        this.name = name;
    }

}
