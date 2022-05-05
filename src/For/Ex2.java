package For;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = sc.nextInt();
        System.out.print("Введите b: ");
        int b = sc.nextInt();
        int q = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            q++;
        }
        System.out.printf("Количество чисел (%d)", q);
    }
}
