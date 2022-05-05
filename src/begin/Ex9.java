package begin;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sg = Math.sqrt(a * b);
        System.out.println("Sg = "+sg);
    }

}
