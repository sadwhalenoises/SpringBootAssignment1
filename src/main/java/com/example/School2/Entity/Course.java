package com.example.School2.Entity;

public class Course {


    private int courseid;
    private String title;
    private String teacher;

    public Course(){

    }

    public Course(int courseid, String title, String teacher) {
        this.courseid = courseid;
        this.title = title;
        this.teacher = teacher;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
