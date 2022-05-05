package recur;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Input 5 numbers N: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int a : n) {
            System.out.println(fact(a) + " ");
        }
    }

    private static double fact(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact(i - 1) * i;
        }
        return fact;
    }
}
