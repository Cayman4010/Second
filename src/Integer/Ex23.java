package Integer;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite znachenie:");
        int a = sc.nextInt();
        a = a % 3600 / 60;
        System.out.print(a);
    }
}