package Boolean;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 0 & b < -2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}