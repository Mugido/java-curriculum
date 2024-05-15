package demo_project.service.impl;

import demo_project.model.Applicants;
import demo_project.service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public void displayApplicantData(Applicants applicants){
        System.out.println("FullName :" + applicants.getName() + "\n" + "Age : " + applicants.getAge() + "\n" + "Gender : " + applicants.getGender());

    }
    @Override
    public void admitStudent(Applicants applicants){
        if(applicants.getAge()>= 18){
            System.out.println("Congratulations!!!, You have been given admission");

        }else{
            System.out.println("You have been rejected");
        }

    }
}
