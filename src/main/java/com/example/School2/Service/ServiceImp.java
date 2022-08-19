package com.example.School2.Service;

import com.example.School2.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImp implements CourseService{

    List<Course> list;

    public ServiceImp(){
        list = new ArrayList<>();
        list.add(new Course(1,"Biology", "Masion"));
        list.add(new Course(2,"Math", "Charles"));
        list.add(new Course(3,"History", "David"));
        list.add(new Course(4,"Art", "Pear"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourseId(int courseId) {
        Course c = null;

        for (Course x: list) {

            if(x.getCourseid() == courseId){
                c = x;
                break;
            }
        }

        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        String title = course.getTitle();
        String teacher = course.getTeacher();
        Course c = null;

        for(Course x: list){
            if(x.getCourseid() == course.getCourseid()){
                c.setTitle(title);
                c.setTeacher(teacher);
            }
        }

        return c;
    }

    @Override
    public String deleteCourse(int courseId) {
        for (Course x: list) {

            if(x.getCourseid() == courseId){
                list.remove(x);
                break;
            }
        }

        return "Course Deleted";
    }
}
