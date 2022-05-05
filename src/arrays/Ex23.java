package arrays;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value of N: ");
        int N = sc.nextInt();
        System.out.print("Input value of K: ");
        int K = sc.nextInt();
        System.out.print("Input value of L: ");
        int L = sc.nextInt();
        int sum = 0;
        int n = 0;
        double[] A = new double[N];
        System.out.print("Input value of elements of array A: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (i < K-1 || i > L - 1) {
                sum += A[i]; n++;
            }
        }
        System.out.println((float)sum/n);
    }
}
