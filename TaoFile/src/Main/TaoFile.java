package Main;

import java.io.File;
import java.io.IOException;

public class TaoFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src\\Main\\Test2.txt");
        if (file1.exists()){
            System.out.println("Đã có file này");
        }else {
            file1.createNewFile();
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file1);
         // Write formatted output to the file
         // Close the file
        output.close();
    }
}

