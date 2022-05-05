package For;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        int F1 = 1;
        int F2 = 1;
        System.out.println(F1);
        System.out.println(F2);
        for (int K = 3; K <= N; K += 1) {
            int FK = F1 + F2;
            F1 = F2;
            F2 = FK;
            System.out.println(FK);
        }
    }

}
