package If;

import java.util.Scanner;

public class Exif26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        double x = sc.nextDouble();
       if (x <= 0) {
          double zn = -x;
           System.out.println(zn);
       }
       if (x > 0 & x < 2) {
           double zn = x * x;
           System.out.println(zn);
       }
       if (x >= 2) {
           double zn = 4;
           System.out.println(zn);
       }

    }
}

