package Boolean;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 99 && a < 1000 && a % 2 == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}