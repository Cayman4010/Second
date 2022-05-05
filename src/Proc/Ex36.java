package Proc;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Input 5 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int a : arr) {
            System.out.print(fibN(a) + " ");
        }
    }
    public static int fibN(int n) {
        int f1 = 1;
        int f2 = 1;
        int f;
        for (int i = 2; i < n; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f2;
    }
}
