package com.example.demo.model;

public class LessonIdentifierResponse {

    private int value;

    public LessonIdentifierResponse(LessonIdentifier lessonIdentifier) {
        this.value = lessonIdentifier.value();
    }

    public int getValue() {
        return value;
    }
}
