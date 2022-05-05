package file;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.File;

public class Ex2 {
    public static void main(String[] arr) throws IOException {
        Scanner sc = new Scanner(System.in);
        String path = new String("E:\\Programs\\Java Course\\Lection 8\\Home_work");
        String fileName = new String("Ex2.txt");
        System.out.print("Input value N: ");
        int n = sc.nextInt();
        File newFile = new File(path, fileName);
        if (!newFile.exists()) newFile.createNewFile();
        PrintStream ps = new PrintStream(newFile);
        int num = 2;
        for (int i = 0; i < n; i++) {
            ps.print(num + " ");
            num += 2;
            ps.close();
        }
    }
}
