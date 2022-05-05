package If;

import java.util.Scanner;

public class Exif27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        double x = sc.nextDouble();
        if (x < 0) {
            double zn = 0;
            System.out.println(zn);
        }
        if (x >= 0 & x < 1 || x >= 2 & x < 3) {
            double zn = 1;
            System.out.println(zn);
        }
        if (x >= 1 & x < 2 || x >= 3 & x < 4) {
            double zn = -1;
            System.out.println(zn);
        }

    }
}

