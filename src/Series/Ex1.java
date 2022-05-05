package Series;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        float d;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value d: ");
        for (int i = 1; i <= 10; i++) {
           d = sc.nextFloat();
           sum = sum + d;
        }
        System.out.println(sum);
    }
}