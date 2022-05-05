package matrix;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of M: ");
        int m = sc.nextInt();
        System.out.print("Input value of N: ");
        int n = sc.nextInt();
        int [][] a = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=10*i;
            }
        }
        System.out.println("Value of elements of array a: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=10*i;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
