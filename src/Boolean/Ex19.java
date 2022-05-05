package Boolean;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == -b || b == -c || a == -c) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
