package arrays; \\ changes

import java.util.Scanner;
import java.util.Arrays;

public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int[] A = new int[N];
        System.out.print("Input value of elements of array A: ");
        for (int i=0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N-1; i++) {
            if (A[i]>A[i+1]) {
                int temp = A[i+1];
                A[i] = temp;
                A[i+1] = A[i];
            }
        }
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
