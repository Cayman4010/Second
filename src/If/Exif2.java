package If;

import java.util.Scanner;

public class Exif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        if (a > 0) {
            a = a + 1;
            System.out.println(a);
        } else {
            a = a - 2;
            System.out.println(a);
        }
    }
}

