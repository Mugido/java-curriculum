package week_4.class_activity_4A;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

    try{
        FileWriter fa = new FileWriter(desktopPath + "/output.csv");
        fa.write("I am leaarning how to write into a csv file");

        fa.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

        System.out.println("successfully written into a csv file");
    }
}

