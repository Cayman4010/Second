package Proc;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.print("Введите 5 значений: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.printf("\nQuantity of digit in number K = %d.", digitCount(array[i]));
        }
    }
    public static int digitCount(int k) {
        int des = 1;
        int sum = 0;
        while(k/des > 0) {
            sum++;
            des *= 10;
        }
        return sum;
    }
}
