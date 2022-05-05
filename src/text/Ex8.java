package text;

import java.util.Scanner;
import java.io.*;

public class Ex8 {
    public static void main(String[] args) throws IOException {
        String fileName1 = "Ex8_1.txt";
        String fileName2 = "Ex8_2.txt";
        File rootDir = new File("E:\\Programs\\Java Course\\Lection 8\\Text");
        File file1 = new File(rootDir, fileName1);
        File file2 = new File(rootDir, fileName2);
        File temp = new File(rootDir, "Temp.txt");
        if(!temp.exists()) temp.createNewFile();
        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);
        Scanner sctemp = new Scanner(temp);
        PrintStream ps1 = new PrintStream(file1);
        PrintStream pstemp = new PrintStream(temp);
        pstemp.print(sc1.nextLine() + sc2.nextLine());
        ps1.println(sctemp.nextLine());
        ps1.close();
        sc1.close();
        sc2.close();
    }
}
