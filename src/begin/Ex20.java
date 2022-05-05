package begin;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double xy = Math.sqrt((Math.abs(x2 - x1) * Math.abs(x2 - x1)) + (Math.abs(y2 - y1) * Math.abs(y2 - y1)));
        System.out.println(xy);
    }
}