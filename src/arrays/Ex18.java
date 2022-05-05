package arrays;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        System.out.print("Input value of elemets of array: ");
        for (int k = 0; k < A.length; k++) {
            A[k] = sc.nextInt();
        }
        for (int k = 0; k <= A.length-1; k++) {
            if (A[k] < A[A.length - 1]) {
                System.out.printf("A[%s] = %s" , k, A[k]);
                break;
            }
            if (k == A.length - 1) {
                System.out.println(0);
                break;
            }
        }
    }
}
