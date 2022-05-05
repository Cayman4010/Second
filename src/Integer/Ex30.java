package Integer;
import java.util.Scanner;

public class Ex30 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int yearNum = scanner.nextInt();
        int cenNum = yearNum / 100 + 1;
        System.out.println(cenNum);
    }
}