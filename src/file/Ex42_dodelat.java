package file;
import java.util.Scanner;
import java.io.*;
public class Ex42_dodelat {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName1 = "Ex42_1.txt";
        String fileName2 = "Ex42_2.txt";
        String rootDir = "E:\\Programs\\Java Course\\Lection 8\\Home_work";
        FileOutputStream fos1 = new FileOutputStream(rootDir + "\\" + fileName1);
        FileOutputStream fos2 = new FileOutputStream(rootDir + "\\" + fileName2);
        String str1 = fos1.toString();
        byte[] bytes1 = str1.getBytes();
        String str2 = fos2.toString();
        byte[] bytes2 = str2.getBytes();
        fos1.write(bytes2);
        fos2.write(bytes1);
        fos1.close();
        fos2.close();


    }
}
