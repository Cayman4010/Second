package begin;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double ab = Math.sqrt((Math.abs(x2 - x1) * Math.abs(x2 - x1)) + (Math.abs(y2 - y1) * Math.abs(y2 - y1)));
        double bc = Math.sqrt((Math.abs(x3 - x1) * Math.abs(x3 - x1)) + (Math.abs(y3 - y1) * Math.abs(y3 - y1)));
        double ac = Math.sqrt((Math.abs(x3 - x2) * Math.abs(x3 - x2)) + (Math.abs(y3 - y2) * Math.abs(y3 - y2)));
        double p = (ab + bc + ac) / 2;
        double S = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        System.out.println(S);
    }
}