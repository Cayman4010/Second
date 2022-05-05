package Case;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        switch (N) {
            case 6: System.out.print("Шестерка "); break;
            case 7: System.out.print("Семерка "); break;
            case 8: System.out.print("Восьмерка "); break;
            case 9: System.out.print("Девятка "); break;
            case 10: System.out.print("Десятка "); break;
            case 11: System.out.print("Валет "); break;
            case 12: System.out.print("Дама "); break;
            case 13: System.out.print("Король "); break;
            case 14: System.out.print("Туз "); break;
            default: System.out.print("Ошибка");
        }
        switch (M) {
            case 1: System.out.print("пик"); break;
            case 2: System.out.print("треф"); break;
            case 3: System.out.print("червей"); break;
            case 4: System.out.print("бубен"); break;
            default: System.out.println("Ошибка");
        }
    }
}
