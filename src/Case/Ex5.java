package Case;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int AB;
        switch (N) {
            case 1:
                AB = A + B;
                System.out.println(AB);
                break;
            case 2:
                AB = A - B;
                System.out.println(AB);
                break;
            case 3:
                AB = A * B;
                System.out.println(AB);
                break;
            case 4:
                AB = A / B;
                System.out.println(AB);
                break;
            default:
                System.out.println("Error, Sanya");
        }
    }
}
