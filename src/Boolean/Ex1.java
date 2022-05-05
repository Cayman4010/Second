package If;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}