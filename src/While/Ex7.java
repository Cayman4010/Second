package While; //1, 3, 4, 7, 8, 11, 15, 17, 18, 19, 21, 22

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
      while (Math.pow(k, 2) <= n) {
          k++;
      }
      System.out.println(k);
    }
}