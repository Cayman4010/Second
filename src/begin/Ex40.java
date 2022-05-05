package begin;

import java.util.Scanner;

public class Ex40{
    public static void main(String[] args) {
        System.out.print("Vvedite: "); //ax + b = 0
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double d = a1*b2-a2*b1;
        double x = (c1*b2 - c2*b1)/d;
        double y = (a1*c2 - a2*c1)/d;
        System.out.println(x);
        System.out.println(y);
    }
}