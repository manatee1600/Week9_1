package com.example.Week9.controller;

import com.example.Week9.entity.Name;

public class NameResponse {
    private int id;
    private String name;

    public NameResponse(Name name){
        this.id = name.getId();
        this.name = name.getName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
