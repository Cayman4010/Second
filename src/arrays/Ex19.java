package arrays;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int num = 0;
        System.out.print("Input value of elemets of array: ");

        for (int k = 0; k < A.length; k++) {
            A[k] = sc.nextInt();
        }

        for (int k = A.length - 1; k >= 0; k--) {
            num++;
            if (A[k] > A[0] & A[k] < A[A.length - 1]) {
                System.out.printf("A[%s] = %s", k, A[k]);
                break;
            }
        }
        if (num == A.length) {
            System.out.println(0);}
    }
}
