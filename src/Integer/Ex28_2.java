package Integer;

import java.util.Scanner;

public class Ex28_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1 - n; 2 - n+1... 8 - n
        System.out.print("Vvedite znachenie:");
        int k = sc.nextInt();
        int n = sc.nextInt();
        int day = (k % 7 + (n - 2)) % 7 + 1;
        System.out.println(day);
    }
}