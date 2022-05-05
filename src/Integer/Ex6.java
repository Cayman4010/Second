package Integer;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 10;
        int c = a % 10;
        System.out.println(b);
        System.out.println(c);
    }

}