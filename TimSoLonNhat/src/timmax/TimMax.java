package timmax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) throws IOException {
        File file1 = new File("DaySo.txt");
        File file2 = new File("KetQua.txt");
        file2.createNewFile();
        if (file1.exists()) {
            System.out.println("ok");
        }
        PrintWriter printWriter = new PrintWriter(file1);
        printWriter.println(2);
        printWriter.println(4);
        printWriter.println(6);
        printWriter.println(8);
        printWriter.close();
        Scanner scanner = new Scanner(file1);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            integers.add(scanner.nextInt());
        }
        int sum = 0;
        int max = integers.get(0);
        for (int i : integers
        ) {
            sum += i;
            if (max < i) {
                max = i;
            }
            PrintWriter printWriter1 = new PrintWriter(file2);
            printWriter1.println("Max = " + sum);
            printWriter1.println("Max = " + max);
            printWriter1.close();
        }

    }
}
