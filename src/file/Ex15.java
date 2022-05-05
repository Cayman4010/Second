package file;

import java.util.Scanner;
import java.io.*;

public class Ex15 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Programs\\Java Course\\Lection 8\\Home_work\\Ex15.txt");
        Scanner sc = new Scanner(file);
        double sumEven = 0;
        String text1 = sc.nextLine();
        String[] strNumbers = text1.split(" ");
        double[] numbers = new double[strNumbers.length];
        for(int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Double.parseDouble(strNumbers[i]);
            if (i%2==0) sumEven += numbers[i];
        }
        System.out.println("Sum of even equals "+ sumEven);

    }
}
