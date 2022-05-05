package Case;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int Month = sc.nextInt();
        switch (Month) {
            case 1:
                System.out.println("Январь - 31");
              break;
            case 2:
                System.out.println("Февраль - 28");
                break;
            case 3:
                System.out.println("Март - 31");
                break;
            case 4:
                System.out.println("Апрель - 30");
                break;
            case 5:
                System.out.println("Май - 31");
                break;
            case 6:
                System.out.println("Июнь - 30");
                break;
            case 7:
                System.out.println("Июль - 31");
                break;
            case 8:
                System.out.println("Август - 31");
                break;
            case 9:
                System.out.println("Сентябрь - 30");
                break;
            case 10:
                System.out.println("Октябрь - 31");
                break;
            case 11:
                System.out.println("Ноябрь - 30");
                break;
            case 12:
                System.out.println("Декабрь - 31");
                break;

            default:
                System.out.println("Error, Sanya");
        }
    }
}
