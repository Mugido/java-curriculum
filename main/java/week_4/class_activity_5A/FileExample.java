package week_4.class_activity_5A;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        //TO CREATE A NEW FILE USE THIS
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            File file = new File(desktopPath + "/myfile.csv");

            if(file.createNewFile()) {
                System.out.println("New file created");
            }else{
                System.out.println("file already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
