package Integer;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a / 100 % 10);
        System.out.println(b);
    }
}
