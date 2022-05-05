package arrays;

import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of n: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Input value of elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] >= max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        int mm = max+min;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) a[i] = mm;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == min) a[i] = mm - min;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == mm) a[i] = mm - max;
        }

        System.out.print("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
