package For;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите цену 1 кг конфет: ");
        double C = sc.nextDouble();
        for (double i = 1; i <= 10; i += 1) {
           System.out.println("Цена " + i + " = "+ i * C);
            // System.out.printf("Цена %f кг конфет равна %f грн.", i, i * 10);
        }
    }
}
