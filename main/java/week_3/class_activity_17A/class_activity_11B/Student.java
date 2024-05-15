package week_3.class_activity_17A.class_activity_11B;

public class Student {

    /*int matricNumber;
    String studentName;
    static String university = "Uniben";

    public Student(int matricNumber, String studentName) {
        this.matricNumber = matricNumber;
        this.studentName = studentName;
    }
    static void changeUniversity(){
        university = "Covenant";
    }
    void display(){
        System.out.println("MatricNumber: " + matricNumber + "," + "  "  + "StudentName: " + studentName +"," + " " + "University: " + university + ".");*/


        int matricNumber;
        String studentName;

        static String university = "Uniben";

        public Student(int matricNumber, String studentName){
            this.matricNumber = matricNumber;
            this.studentName = studentName;
        }
        static void changeUniversity(){
            university = "Covenant";
        }
        void display(){
            System.out.println("MatricNumber: " + matricNumber + "," + " " + "StudentName: " + studentName + "," + " " + "University: " + university + ".");

        }
}