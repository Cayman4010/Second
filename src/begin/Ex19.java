package begin;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x = Math.abs(x2 - x1);
        int y = Math.abs(y2 - y1);
        int P = 2 * x + 2 * y;
        int S = x * y;
        System.out.println(P);
        System.out.println(S);
    }
}