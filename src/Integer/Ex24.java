package Integer;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        System.out.print("Vvedite znachenie:");
        int k = sc.nextInt();
        int day = (k % 7) % 7;
        System.out.print(day);
    }
}