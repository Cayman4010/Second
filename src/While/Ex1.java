package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int exp = 0;
        while (a >= b) {
            a = a - b;
            exp++;
        }
        System.out.println("Result =" + (a % b));
    }
}
