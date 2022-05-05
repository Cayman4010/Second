package Integer;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 100;
        int a2 = (a / 10) % 10;
        int a3 = a % 10;
        int a213 = a1*10 + a2*100 + a3;
        System.out.println(a213);
    }

}