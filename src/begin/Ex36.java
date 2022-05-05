package begin;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        double V1 = sc.nextDouble();
        double V2 = sc.nextDouble();
        double T = sc.nextDouble();
        double S = sc.nextDouble();
        double S2 = S + T * (V1 + V2);
        System.out.println(S2);
    }
}