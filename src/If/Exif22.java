package If;

import java.util.Scanner;

public class Exif22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ( x > 0 & y > 0) {
            System.out.println("I");
        }
        if ( x > 0 & y < 0) {
            System.out.println("IV");
        }
        if ( x < 0 & y > 0) {
            System.out.println("II");
        }
        if ( x < 0 & y < 0) {
            System.out.println("III");
        }


    }
}