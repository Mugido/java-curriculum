package week_4.class_activity_2A;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        //FOR ONE LINE OF TEXT

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Reader r = new FileReader(desktopPath + "/output.csv");

            int readContent =  r.read();

            while(readContent != -1){
                System.out.println((char)readContent);
                readContent = r.read();
            }
            r.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
