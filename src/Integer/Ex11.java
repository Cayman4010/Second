package Integer;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 100;
        int a2 = (a / 10) % 10;
        int a3 = a % 10;
        int asum = a1 + a2 + a3;
        int apr = a1 * a2 * a3;
        System.out.println(asum);
        System.out.println(apr);
    }

}