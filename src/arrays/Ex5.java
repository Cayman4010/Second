package arrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        int[] array = new int[N];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < N; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i <N; i++) {
            System.out.println(array[i]);
        }


    }
}
