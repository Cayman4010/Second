package For;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value A: ");
        double A = sc.nextDouble();
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        int step = 0;
        for (double i = A; i <= N; i *= A) {
            step++;
            System.out.println(Math.pow(A, step));
        }
    }

}
