package arrays;

import java.util.Scanner;

public class Ex54_2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Input value of N: ");
        int N = n.nextInt();
        int leng = N;
        int[] a = new int[N];
        int[] b = new int[leng];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива А: ");
            a[i] = n.nextInt();
        }

        for (int i = 0; i < N; i++) {
            b[i] = n.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 0) {
                b[leng] = a[i];
            } else {
                leng = leng - 1;
            }
        }
        for (int i = 0; i < leng; i++) {
            System.out.print(b[i]);
        }
    }
}
