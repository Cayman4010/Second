package If;

import java.util.Scanner;

public class Exif21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println(0);
        }
        if (a == 0 & b != 0) {
            System.out.println(1);
        }
        if (b == 0 & a != 0) {
            System.out.println(2);
        }
        if (a != 0 & b != 0) {
            System.out.println(3);}

    }
}