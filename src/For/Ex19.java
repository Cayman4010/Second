package For;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int N = sc.nextInt();
        double pr = 1;
        for (int i = 1; i <= N; i += 1) {
            pr = pr * (float)i;
        }
        System.out.println(pr);
    }

}
