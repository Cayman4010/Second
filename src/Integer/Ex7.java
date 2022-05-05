package Integer;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 10;
        int c = a % 10;
        int asum = b+c;
        int amn = b * c;
        System.out.println(asum);
        System.out.println(amn);
    }

}