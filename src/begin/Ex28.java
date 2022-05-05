package begin;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long A2 = A * A;
        long A3 = A2 * A;
        long A5 = A3 * A2;
        long A10 = A5 * A5;
        long A15 = A5 * A10;
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A5);
        System.out.println(A10);
        System.out.println(A15);
    }
}