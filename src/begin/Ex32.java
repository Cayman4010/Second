package begin;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        int Tc = sc.nextInt();
        int Tf = Tc * 9 / 5 + 32;
        System.out.println(Tf);
    }
}