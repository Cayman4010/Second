package begin;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble();
        double U = sc.nextDouble();
        double T1 = sc.nextDouble();
        double T2 = sc.nextDouble();
        double S1 = (V - U) * T1;
        double S2 = (V + U) * T2;
        double S = S1 + S2;
        System.out.println(S);
    }
}