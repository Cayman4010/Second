package begin;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 3 * x * x * x * x * x * x;
        int b = 6 * x * x ;
        int y = a - b - 7;
        System.out.println(y);
    }
}