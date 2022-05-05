package For;
import java.util.Scanner;
public class Ex10 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        int N = sc.nextInt();
        double sum = 0;
        for (double i = 1; i <= N; i++) {
            sum = sum + 1/i;
        }
        System.out.println(sum);
    }

}
