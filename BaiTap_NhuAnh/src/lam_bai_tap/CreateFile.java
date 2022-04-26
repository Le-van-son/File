package lam_bai_tap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("inp.txt");
        if (file1.exists()){
            System.out.println("File đã tồn tại");
            System.exit(1);
        }
//        PrintWriter output = new PrintWriter(new File("Emdat09.txt"));
//        output.println("Em coc con yeu qua");
//        output.print("ok em");
//        output.close();
        Scanner sc = new Scanner(new File("inp.txt"));
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
//        file1.delete();
//        if (file1.exists()){
//            System.out.println("File đã tồn tại");
//            System.exit(1);
//        }

    }
}
