package demo_project.service;

import demo_project.model.Principal;
import demo_project.model.Student;

public interface StudentService {

    void display(Student student, Principal principal);

    void expelStudent(Student student, Principal principal);
}
