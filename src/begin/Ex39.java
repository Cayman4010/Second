package begin;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        System.out.print("Vvedite: "); //ax + b = 0
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}