package begin;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");       // x - a
        Scanner sc = new Scanner(System.in); // y - hz
        double x = sc.nextDouble();
        double a = sc.nextDouble();
        double y = sc.nextDouble();
        double b = sc.nextDouble();
        double cenShok = a / x;
        double cenIr = b / y;
        double raznShokIr = cenShok / cenIr;
        System.out.println(cenShok);
        System.out.println(cenIr);
        System.out.println(raznShokIr);
    }
}