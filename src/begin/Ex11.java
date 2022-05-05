package begin;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a + b;
        double razn = a - b;
        double proizv = a * b;
        double chast = a/b;
        System.out.println("summa ravna " + sum);
        System.out.println(razn);

    }

}
