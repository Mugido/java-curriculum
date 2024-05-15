package demo_project.service.impl;

import demo_project.model.Principal;
import demo_project.model.Student;
import demo_project.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void display(Student student, Principal principal){
        System.out.println("Student FullName : " + student.getName() + "\n" + "Expulsion Duration : " + "2 WEEKS" + "\n" + "Expelled By : " + "Principal " + principal.getName());
    }

    @Override
    public void expelStudent(Student student, Principal principal) {

    }
}
