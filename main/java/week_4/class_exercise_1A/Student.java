package week_4.class_exercise_1A;

public class Student {
    private int admissionNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int age;
    private String gender;

    public Student(int admissionNumber, String firstName, String lastName, String dateOfBirth, int age, String gender) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admissionNumber=" + admissionNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';

    }
}

