package If;

import java.util.Scanner;

public class Exif18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a != b & a != c) {
            System.out.println(1);
        }
        if (b != a & b != c) {
            System.out.println(2);
        }
        if (c != b & a != c) {
            System.out.println(3);
        }

    }
}

