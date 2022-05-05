package arrays;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of N: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;
        System.out.print("Input value of elements of array A: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int D = A[1] - A[0];
        for (int i = 1; i <= N - 1; i++) {
            if (D == A[i] - A[i - 1]) {
                sum++;
            }
        }
        if (sum == A.length - 1) {
            System.out.println("D = " + D);
        } else {
            System.out.println(0);
        }
    }
}
