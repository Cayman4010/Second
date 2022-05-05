package begin;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        x = x - 3;
        x = x * x * x;
        long y = 4 * x * x - 7 * x + 2;
        System.out.println(y);
    }
}