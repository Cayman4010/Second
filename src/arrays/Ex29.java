package arrays;

import java.util.Scanner;

public class Ex29 {
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
        int high = A[0];
        for (int i = 2; i < N; i += 2) {
            if (A[i] >= high) {
                high = A[i];
            }
        }
        System.out.println(high);
    }
}
