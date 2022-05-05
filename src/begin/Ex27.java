package begin;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        System.out.print("Vvedite: ");
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long A2 = A * A;
        long A4 = A2 * A2;
        long A8 = A4 * A4;
        System.out.println(A2);
        System.out.println(A4);
        System.out.println(A8);
    }
}