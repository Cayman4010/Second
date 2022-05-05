package Proc;

import java.util.Scanner;

public class Ex28_dodelat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int quan = 0;
        System.out.print("Введите 10 значений: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (isPrime(array[i])) quan++;
        }
       System.out.printf("Quantity of Prime number is %d.", quan);
    }

    public static boolean isPrime(int n) {
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((double)n%i == 0) sum++;
            }
        return sum > 0;
        }
    }
