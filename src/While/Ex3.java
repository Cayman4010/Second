package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int exp = 0;
        int nn = n;
        if (n >= k) {
            while (n >= k) {
                n = n - k;
                exp++;
            }
            System.out.println("Chastnoye = " + exp);
            System.out.println("Ostatok = " + (nn - exp * k));
        } else {
            while (n < k) {
                k--;

            }
            System.out.println("Chastnoye = 0");
            System.out.println("Ostatok = " +n);
        }

    }
}