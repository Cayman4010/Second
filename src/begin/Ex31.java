package begin;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        int Tf = sc.nextInt();
        int Tc = (Tf - 32) * 5 / 9;
        System.out.println(Tc);

    }
}