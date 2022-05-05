package For;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        double rez = 0;
        int step = N + 1;
        for (int i = 1; i <= N; i++) {
            int nk = 1;
            step--;
            for (int j = step; j>= 1; j--) nk*=i;
            rez += nk;
        }
        System.out.println(rez);
    }
}
