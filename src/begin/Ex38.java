package begin;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        System.out.print("Vvedite: "); //ax + b = 0
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = -b / a;
        System.out.println(x);
    }
}