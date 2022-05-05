package arrays;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of N: ");
        int n = sc.nextInt(), temp;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.print("Input value of elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Input value of elements of array b: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = c[i];
        }
        System.out.print("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Array b: ");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}



