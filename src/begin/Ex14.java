package begin;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.print("Vvedite znacheniya: ");
        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        double pi = 3.14;
        double R = L / (2 * pi);
        double S = pi * R * R;
        System.out.println(R);
        System.out.println(S);
    }

}
