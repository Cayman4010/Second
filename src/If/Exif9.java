package If;

import java.util.Scanner;

public class Exif9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a > b) {
            double c = a + b;
            a = c - a;
            b = c - b;
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}