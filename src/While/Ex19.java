package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input P: ");
        int N = sc.nextInt();
        int k = 0;
        while (N > 0) {
            k = k * 10 + (N % 10);
            N /= 10;
        }
        System.out.println("Quantity of digits: " + k);
    }
}