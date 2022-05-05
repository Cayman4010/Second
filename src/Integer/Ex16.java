package Integer;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = (a / 100);
        int a2 = (a - (100 * a1)) / 10;
        int a3 = a - (a1 * 100 + a2 * 10);
        a = a1 * 100 + 10*a3 + a2;
        System.out.println(a);


    }

}
