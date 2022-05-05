package arrays;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
            if ((i+1) % 2 == 1) continue;
            System.out.println(array[i]);
        }

        for (int i = N-1; i >=0; i--) {
            array[i] = i+1;
            if ((i+1)%2 == 0) continue;
            System.out.println(array[i]);
        }
    }
}
