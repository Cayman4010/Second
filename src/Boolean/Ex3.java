package Boolean;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a % 2;
        if (a == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}