package For; // 1, 2, 3, 4, 6, 7, 10, 12, 13, 16, 17, 19, 33
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner xerox = new Scanner(System.in);
        System.out.print("a: ");
        int a = xerox.nextInt();
        System.out.print("b: ");
        int b = xerox.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i += 1) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
