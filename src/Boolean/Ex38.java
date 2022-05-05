package Boolean;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (Math.abs((x1 - x2) * (y1 - y2)) == 2) {
            System.out.println("ПРАВИЛЬНО");
        } else {System.out.println("НЕПРАВИЛЬНО");}
    }
}
