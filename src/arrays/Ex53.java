package arrays;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of N: ");
        int n = sc.nextInt();
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
            if (a[i]>=b[i]) c[i]=a[i];
            else {
                c[i] = b[i];
            }
        }
        System.out.print("Array c: ");
       for (int i : c) {
           System.out.print(i + " ");
       }
    }
}



