package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();
        int k = 0;
        int sum = 0;
        while (sum < n) {
            k++; sum +=k;
        }
        System.out.println(k);
        System.out.println(sum);
    }
}