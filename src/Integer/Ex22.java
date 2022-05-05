package Integer;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite znachenie:");
        int a = sc.nextInt();
        a = a % 3600;
        System.out.print(a);
    }
}