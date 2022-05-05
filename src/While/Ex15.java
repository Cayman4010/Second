package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input P: ");
        int P = sc.nextInt();
        int S = 1000;
        int S2 = 1100;
        int K = 0;
        while (S * Math.pow((1+(float)P/100), K) < S2) {
            K++;
        }
        System.out.println(K);
        System.out.println(S * Math.pow((1+(float)P/100), K));
    }
}