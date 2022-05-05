package Proc;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.print("Введите 10 значений: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (even(array[i])) sum++;
        }
        System.out.printf("Quantity of double number is %d.", sum);
    }

    public static boolean even(int k) {
        return k % 2 == 0;
    }

}
