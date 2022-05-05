package arrays;

import java.util.Scanner;

public class Ex32 {
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

        for (int i = 1; i < N - 1; i++) {
            if (A[i] < A[i - 1] && A[i] < A[i + 1]) {
                System.out.println("Number of first local minimum: " + i);
                sum++;
                break;
            }
        }
        if (sum == 0) System.out.println("Local minimum not found");
    }
}

