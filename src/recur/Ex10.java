package recur;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Input 5 numbers N: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int a : n) {
            System.out.println(digitSum(a) + " ");
        }
    }

    private static double digitSum(int k) {
        double des = 1;
        double sum = 0;
        k /= 10 * des;
        sum++;
        return sum;
    }
}
