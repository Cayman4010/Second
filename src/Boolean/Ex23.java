package Boolean;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a1234 = sc.nextInt();
        int a1 = a1234 / 1000;
        int a2 = a1234 % 1000 / 100;
        int a3 = a1234 % 1000 % 100 / 10;
        int a4 = a1234 % 1000 % 100 % 10;
        if (a1 == a4 && a2 == a3) {
            System.out.println("ПРАВИЛЬНО");
        } else {System.out.println("НЕПРАВИЛЬНО");}
    }
}
