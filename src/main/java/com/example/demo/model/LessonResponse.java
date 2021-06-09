package com.example.demo.model;

public class LessonResponse {

    private int id;
    private String studentName;
    private String tutorName;

    public LessonResponse(int id, String studentName, String tutorName) {
        this.id = id;
        this.studentName = studentName;
        this.tutorName = tutorName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTutorName() {
        return tutorName;
    }
}
