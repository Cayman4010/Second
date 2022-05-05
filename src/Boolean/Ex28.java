package Boolean;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0 || x < 0 & y < 0) {
            System.out.println("ПРАВИЛЬНО");
        } else {System.out.println("НЕПРАВИЛЬНО");}
    }
}
