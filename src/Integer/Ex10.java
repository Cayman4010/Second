package Integer;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 100;
        int a2 = (a - a1*100) / 10;
        int a3 = a % 10;
        System.out.println(a3);
        System.out.println(a2);
    }

}