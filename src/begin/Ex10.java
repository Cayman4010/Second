package begin;
import java.util.Scanner;

public class Ex10 {
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
        System.out.println(proizv);
        System.out.println(chast);
    }

}
