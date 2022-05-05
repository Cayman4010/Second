package Boolean;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a * a + b * b == c * c||
            a * a + c * c == b * b||
            b * b + c * c == a * a) {
            System.out.println("ПРАВИЛЬНО");
        } else {System.out.println("НЕПРАВИЛЬНО");}
    }
}
