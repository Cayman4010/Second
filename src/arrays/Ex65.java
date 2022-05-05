package arrays;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input value of K: ");
        int k = sc.nextInt();

        System.out.print("Input value of elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int plus = a[k-1];
        for (int i = 0; i < n; i++) a[i]+=plus;
        System.out.print("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
