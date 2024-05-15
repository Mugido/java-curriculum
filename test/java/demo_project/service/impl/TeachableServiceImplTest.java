package demo_project.service.impl;

import demo_project.enums.CourseOffer;
import demo_project.enums.Gender;
import demo_project.model.Course;
import demo_project.model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeachableServiceImplTest {

    @Test
    void itShouldBeAbleToTeachCourse() {
        //Arrange 3rd


        //Create a mock Teacher object 1st
        Teacher teacherInput = new Teacher("John Doe", 34, Gender.MALE);

        //create a mock course object
        Course course = new Course(CourseOffer.JAVA);

        //Create an instance of TeachableServiceImpl 2nd
        TeachableServiceImpl teachableService = new TeachableServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.out.println(new PrintStream(actualContent));

        //Act
        //Call the method being tested 3rd
        teachableService.teachCourse(teacherInput, course);
        //Assert
        //Retrieve the output from the console
        String expected = "FullName :John Doe\n Gender : MALE\n Age : 32\n Course taught : JAVA\n";

        assertEquals(expected, actualContent.toString());
    }

    @Test
    void ItShouldBeAbleToTakeCourse() {
    }
}