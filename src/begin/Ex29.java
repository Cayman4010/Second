package begin;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double p = 3.14;
        double qr = a / 180 * p;
        System.out.println(qr);

    }
}