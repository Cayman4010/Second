package begin;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double p = 3.14;
        double g = a / p * 180;
        System.out.println(g);

    }
}