package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double nn = n;
        while (nn >= 3) {
            nn /= 3;
        }
        if (nn == 1) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}