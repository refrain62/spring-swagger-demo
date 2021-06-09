package com.example.demo.model;

public class Identifier {

    private String value;

    public Identifier(String value) {
        this.value = value;
    }

    public String value() {
        if (value == null) return "";
        return value;
    }
}
