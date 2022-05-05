package For;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value A: ");
        double A = sc.nextDouble();
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        double sum = 1;
        for (double i = 1; i <= N; i += 1) {
            sum = sum + Math.pow(A, i);
        }
        System.out.println(sum);
    }

}
