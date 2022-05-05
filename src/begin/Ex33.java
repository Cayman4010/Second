package begin;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");       // x - a
        Scanner sc = new Scanner(System.in); // y - hz
        double x = sc.nextDouble();
        double a = sc.nextDouble();
        double y = sc.nextDouble();
        double hz = a * y / x;
        double hz1 = a * 1 / x;
        System.out.println(hz);
        System.out.println(hz1);
    }
}