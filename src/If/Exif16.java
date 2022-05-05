package If;

import java.util.Scanner;

public class Exif16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b & b <= c) {
            a = 2 * a;
            b = 2 * b;
            c = 2 * c;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else {
            a = -a;
            b = -b;
            c = -c;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

    }
}

