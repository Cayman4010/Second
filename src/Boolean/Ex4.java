package Boolean;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 2 & b <= 3) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}