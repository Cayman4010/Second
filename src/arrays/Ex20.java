package arrays;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of N: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.print("Input value of K: ");
        int K = sc.nextInt();
        System.out.print("Input value of L: ");
        int L = sc.nextInt();
        int sum = 0;
        System.out.print("Input value of elemets of array: ");

        for (int k = 0; k < A.length; k++) {
            A[k] = sc.nextInt();
        }
        for (int k = 0; k <= N; k++) {
            if (k >= K-1 && k <= L-1){
                sum += A[k];
            }
        }
        System.out.println(sum);
    }
}