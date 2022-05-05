package If;

import java.util.Scanner;

public class Exif7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

