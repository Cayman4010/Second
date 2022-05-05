package Case;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String str = "Ошибка";
        switch (K) {
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлитворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.printf("%s", str);
        }
    }
}
