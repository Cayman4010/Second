package arrays;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 1; i < N; i += 2) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}
