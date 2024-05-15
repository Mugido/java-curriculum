package demo_project;

import demo_project.enums.CourseOffer;
import demo_project.enums.Gender;
import demo_project.model.*;
import demo_project.service.impl.ApplicantServiceImpl;
import demo_project.service.impl.PrincipalServiceImpl;
import demo_project.service.impl.StudentServiceImpl;
import demo_project.service.impl.TeachableServiceImpl;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Okoro Uche", 17, Gender.MALE);
        Teacher teacher2 = new Teacher("Kiki Tope", 22, Gender.FEMALE);

        Student student1 = new Student("Neche Tar", 21, Gender.MALE);
        Student student2 = new Student("Royale Danjuma", 24, Gender.FEMALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.NODE);

        Principal principal1 = new Principal("Obi Tornado", 57, Gender.MALE);
        PrincipalServiceImpl principalData = new PrincipalServiceImpl();

        Student student = new Student("Jason", 24, Gender.MALE);

        StudentServiceImpl expelStudent = new StudentServiceImpl();

        Applicants applicants1 = new Applicants("Phillip", 18, Gender.MALE);
        Applicants applicants2 = new Applicants("Royal", 17, Gender.FEMALE);
        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();


        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();


        System.out.println("Student Data");
        teachableService1.takeCourse(student1, course1);
        System.out.println("*********************");

        System.out.println("Student Data");
        teachableService2.takeCourse(student2, course2);
        System.out.println("**********************");

        System.out.println("Teacher Data");
        teachableService1.teachCourse(teacher1, course1);
        System.out.println("********************");

        System.out.println("Teacher Data");
        teachableService2.teachCourse(teacher2, course2);
        System.out.println("*********************");

        System.out.println("Principal Data");
        principalData.display(principal1);
        System.out.println("*********************");


        System.out.println("Student Expelled Data");
        expelStudent.expelStudent(student, principal1);
        System.out.println("**********************");

        System.out.println("Applicant Data");
        applicantData.displayApplicantData(applicants1);
        applicantData.displayApplicantData(applicants2);
        System.out.println("**********************");

        System.out.println("Successful Admission Data");
        applicantData.admitStudent(applicants1);
        System.out.println("**********************");

        System.out.println("Admission Denied Data");
    }

}
