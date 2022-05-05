package begin;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double pi = 3.14;
        double s1 = pi * r1 * r1;
        double s2 = pi * r2 * r2;
        double s3 = s1 - s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
