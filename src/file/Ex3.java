package file;

import java.io.*;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] arr) throws IOException {
        Scanner sc = new Scanner(System.in);

        String fileName = new String("Ex3.docs");
        System.out.print("Input value A: ");
        double a = sc.nextInt();
        System.out.print("Input value D: ");
        double d = sc.nextInt();
        File rootDir = new File("E:\\Programs\\Java Course\\Lection 8\\Home_work");
        if(!rootDir.exists()) rootDir.mkdirs();
        File newFile = new File(rootDir, fileName);
        if (!newFile.exists()) newFile.createNewFile();
        PrintStream ps = new PrintStream(newFile);
        for (int i = 0; i < 10; i++) {
            ps.print(a+d*i + ", ");
        }
        ps.close();
    }
}
