package begin;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        double S = sc.nextDouble();
        double pi = 3.14;
        double D = Math.sqrt(S / pi) * 2;
        double L = pi * D;
        System.out.println(D);
        System.out.println(L);
    }

}
