package week_4.class_activity_5A;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        //TO DELETE OUR FILE USE THIS
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        File file = new File(desktopPath + "/myfile.csv");

        if(file.delete()) {
            System.out.println("file deleted");
        }else{
            System.out.println("fail to delete file");
        }
    }
}
