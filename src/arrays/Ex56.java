package arrays;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n/3];
        System.out.print("Input value of elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n/3; i += 1) {
            b[i] = a[i*3+2];
        }
        System.out.print("Array b: ");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf ("\nQuantity of numbers = %d.", b.length);
    }
}

