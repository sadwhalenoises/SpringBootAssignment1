package com.example.School2.Controller;

import com.example.School2.Entity.Course;
import com.example.School2.Service.CourseService;
import com.example.School2.Service.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SchoolController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome!</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourseId(Integer.parseInt(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourse(Integer.parseInt(courseId));
    }
}
