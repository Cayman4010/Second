package Boolean;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 & b > 0 & c <= 0 ||
            a > 0 & b <= 0 & c > 0 ||
            a <= 0 & b > 0 & c > 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}