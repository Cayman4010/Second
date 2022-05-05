package Integer;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a % 10000 / 1000);
        System.out.println(b);
    }
}