package For;
import java.util.Scanner;
public class Ex13 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        int N = sc.nextInt();
        double sum = 0;
        for (double i = 1; i <= N; i += 2) {
            sum += (1 + i/10);
        }
        for (double i = 2; i <= N; i += 2) {
            sum -= (1 + i/10);
        }
        System.out.println(sum);
    }

}
