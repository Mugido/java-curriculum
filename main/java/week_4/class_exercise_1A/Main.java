package week_4.class_exercise_1A;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       //step1 create an array of student objects
        Student[] students = new Student[5];

        students[0] = new Student(191,"Omotayo","Fasua", "25/4/1993", 29,"Female");
        students[1] = new Student(192,"Namin","Bolbong", "17/7/1998", 26,"Male");
        students[2] = new Student(193,"Yusuf","Firdausi", "25/9/2000", 24,"Female");
        students[3] = new Student(194,"Enyiagu","Nnachebe", "2/8/1995", 28,"Male");
        students[4] = new Student(195,"Abasiofon","George", "26/10/2001", 23,"Male");

        //step2 write student objects into a csv file
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fileWriter = new FileWriter(desktopPath + "/output3.csv");

            fileWriter.write("Admission Number, firstName, lastName, dateOfBirth, age, gender \n ");
            for(Student student : students){
                fileWriter.write(student.getAdmissionNumber() + " , ");
                fileWriter.write(student.getFirstName() + " , ");
                fileWriter.write(student.getLastName() + " , ");
                fileWriter.write(student.getDateOfBirth() + " , ");
                fileWriter.write(student.getAge() + " , ");
                fileWriter.write(student.getGender() + " \n ");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
    }
        System.out.println("Data Has Successfully been Inputed");
         }

    }

