package Integer;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1 - 0; 2 - 1... 8 - 0
        System.out.print("Vvedite znachenie:");
        int k = sc.nextInt();
        int day = (k % 7 + 3) % 7;
        System.out.print(day);
    }
}