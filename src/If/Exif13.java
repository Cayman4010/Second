package If;

import java.util.Scanner;

public class Exif13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b & c >= a || a <= b & c <= a) {
            System.out.println(a);
        }
        if (b >= c & a >= b || b <= c & a <= b) {
            System.out.println(b);
        }
        if (c >= b & a >= c || c <= b & a <= c) {
            System.out.println(c);
        }
    }
}

