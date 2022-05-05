package begin;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int AC = Math.abs(a - c);
        int BC = Math.abs(b - c);
        int umn = AC * BC;
        System.out.println(AC);
        System.out.println(BC);
        System.out.println(umn);
    }
}