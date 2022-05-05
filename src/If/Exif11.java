package If;

import java.util.Scanner;

public class Exif11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a != b) {
            if (a > b) {
                b = a;
                System.out.println(a);
                System.out.println(b);
            } else {
                a = b;
                System.out.println(a);
                System.out.println(b);
            }
        } else {
            a = 0;
            b = 0;
            System.out.println(a);
            System.out.println(b);
        }
    }
}

