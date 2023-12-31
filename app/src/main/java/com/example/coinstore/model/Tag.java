package com.example.coinstore.model;

import com.google.gson.annotations.SerializedName;

public class Tag {
    private String id;
    private String name;
    @SerializedName("coin_counter")
    private Integer coinCounter;
    @SerializedName("ico_counter")
    private Integer icoCounter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoinCounter() {
        return coinCounter;
    }

    public void setCoinCounter(Integer coinCounter) {
        this.coinCounter = coinCounter;
    }

    public Integer getIcoCounter() {
        return icoCounter;
    }

    public void setIcoCounter(Integer icoCounter) {
        this.icoCounter = icoCounter;
    }
}

 /*{

    "tags": [
        {
            "id": "segwit",
            "name": "Segwit",
            "coin_counter": 10,
            "ico_counter": 0
        },
       */
