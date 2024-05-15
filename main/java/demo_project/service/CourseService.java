package demo_project.service;

import demo_project.model.Course;
import demo_project.model.Student;
import demo_project.model.Teacher;

public interface CourseService {
    //abstract method without a body
    void teachCourse(Teacher teacher, Course course);

    void takeCourse(Student student, Course course);
}
