package begin;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.sqrt(a*a+b*b);
        double p = a + b + c;
        System.out.println("c ravna " + c);
        System.out.println(p);
    }

}
