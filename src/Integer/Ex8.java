package Integer;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 10;
        int a2 = a % 10;
        int a21 = a2 * 10 + a1;
        System.out.println(a21);
    }

}