package For;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        System.out.print("Input value K: ");
        int K = sc.nextInt();
        int rez = 0;
        for (int i = 1; i <= N; i++) {
            int nk = 1;
            for (int i2 = 1; i2 <= K; i2++) nk*=i;
            rez += nk;
        }
        System.out.println(rez);
    }
}
