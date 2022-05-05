package arrays;

import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input value of k: ");
        int k = sc.nextInt();

        System.out.print("Input value of elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = k - 1; i < n-1; i++) {
            a[i]=a[i+1];
        }
        a[n-1] = 0;

        System.out.print("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
