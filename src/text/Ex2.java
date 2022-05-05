package text;

import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input file name: ");
        String fileName = sc.nextLine();
        System.out.print("Input value N: ");
        int n = sc.nextInt();
        File outDir = new File("E:\\Programs\\Java Course\\Lection 8\\Text");
        File file = new File(outDir, fileName);
        if (!file.exists()) file.createNewFile();
        PrintStream ps = new PrintStream(file);
        String str = "";
        char a = 97;
        for (int i = 0; i < n; i++) {
            str = str + a;
            if (i == n - 1) {
                ps.println(str.toUpperCase());
            } else ps.println(str);
            a = (char) (a + 1);
        }
        ps.println();
        ps.close();
    }
}
