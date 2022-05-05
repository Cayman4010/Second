package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input P: ");
        int N = sc.nextInt();
        while (N > 0) {
            System.out.println((N % 10));
            N/=10;
        }
    }
}