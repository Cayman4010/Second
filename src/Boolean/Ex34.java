package Boolean;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a * b) % 2 == 0) {
            System.out.println("ПРАВИЛЬНО");
        } else {System.out.println("НЕПРАВИЛЬНО");}
    }
}
