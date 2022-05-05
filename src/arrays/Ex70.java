package arrays;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.print("Input value of elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            if(i <= n/2-1) a[i] = b[i + n/2];
            if(i > n/2-1) a[i] = b[i - n/2];
        }

        System.out.print("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
