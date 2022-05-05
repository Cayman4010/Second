package begin;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = a + b + c;
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        a = p - ac;
        b = p - ab;
        c = p - bc;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}