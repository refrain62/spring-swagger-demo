package com.example.demo.model;

public class LessonRequest {

    private String studentName;
    private String tutorName;

    public LessonRequest(String studentName, String tutorName) {
        this.studentName = studentName;
        this.tutorName = tutorName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTutorName() {
        return tutorName;
    }
}
