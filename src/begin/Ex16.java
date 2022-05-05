package begin;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int s = Math.abs(x1 - x2);
        System.out.println(s);
    }

}
