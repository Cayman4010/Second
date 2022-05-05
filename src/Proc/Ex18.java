package Proc;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius a: ");
        double a = sc.nextDouble();
        System.out.print("Input radius b: ");
        double b = sc.nextDouble();
        System.out.print("Input radius c: ");
        double c = sc.nextDouble();
        System.out.printf("Area of circle with radius %s equals %s", a, circleS(a));
        System.out.printf("\nArea of circle with radius %s equals %s", b, circleS(b));
        System.out.printf("\nArea of circle with radius %s equals %s", c, circleS(c));
    }


    public static double circleS(double r) {
        double p = 3.14;
        return p * Math.pow(r, 2);
    }

}
