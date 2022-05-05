package file;

import java.util.Scanner;
import java.io.*;

public class Ex8 {
    public static void main(String[] args) throws IOException {
        String fileName1 = new String("Ex8_1.txt");
        String fileName2 = new String("Ex8_2.txt");
        File rootDir = new File("E:\\Programs\\Java Course\\Lection 8\\Home_work");
        File file1 = new File("E:\\Programs\\Java Course\\Lection 8\\Home_work", fileName1);
        File file2 = new File("E:\\Programs\\Java Course\\Lection 8\\Home_work", fileName2);
        if (!file2.exists()) file2.createNewFile();
        PrintStream ps2 = new PrintStream(file2);
        Scanner sc = new Scanner(file1);
        String text1 = sc.nextLine();
        String[] numbers = text1.split(" ");
        ps2.print(numbers[0] + " " + numbers[numbers.length-1]);
        ps2.close();

    }
}
