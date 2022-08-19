package com.example.School2.Service;

import com.example.School2.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();
    Course getCourseId(int courseId);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourse(int courseId);
}
