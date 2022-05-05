package Integer;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = a % b;
        System.out.println(ab);
    }

}