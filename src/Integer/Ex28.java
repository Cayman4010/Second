package Integer;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1 - n; 2 - n+1; 3 - n+2; 8 - n
        System.out.print("Vvedite znachenie:");
        int k = sc.nextInt();
        int n = sc.nextInt();
        int day = (k % 7 + (n - 1)) % 7;
        if (day == 0) {
            System.out.println("7");
        } else
        {
            System.out.println(day);
        }
    }
}