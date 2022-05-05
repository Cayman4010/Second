package arrays;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Input value N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nepar = 1;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println(nepar); nepar +=2;
        }

    }
}
