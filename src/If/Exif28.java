package If;

import java.util.Scanner;

public class Exif28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        double x = sc.nextDouble();
        double god100 = x % 100;
        double god400 = x % 400;
        double god4 = x % 4;
        if (god4 != 0 || (god100 == 0 & god400 != 0)) {
            System.out.println(365);
        } else {
            System.out.println(366);
        }
    }
}

