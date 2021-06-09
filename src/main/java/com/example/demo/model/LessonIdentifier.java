package com.example.demo.model;

public class LessonIdentifier {

    private Integer value;

    public LessonIdentifier(String value) {
        this.value = Integer.valueOf(value);
    }

    public LessonIdentifier(int value) {
        this.value = value;
    }

    public Integer value() {
        if (value == null) return 0;
        return value;
    }
}
