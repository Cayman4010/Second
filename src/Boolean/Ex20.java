package Boolean;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 100;
        int a2 = (a % 100) / 10;
        int a3 = a - a1 * 100 - a2 * 10;
        if (a1 != a2 && a2 != a3 && a3 != a1) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
