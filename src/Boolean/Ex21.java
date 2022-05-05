package Boolean;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a123 = sc.nextInt();
        int a1 = a123 / 100;
        int a2 = a123 % 100 / 10;
        int a3 = a123 - a1 * 100 - a2 * 10;
        if (a1 < a2 && a2 < a3) {
            System.out.println("Цифры числа возрастают");
        } else {System.out.println("Цифры числа НЕ ВОЗРАСТАЮТ");}
    }
}
