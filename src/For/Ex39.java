package For;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value A: ");
        int A = sc.nextInt();
        System.out.print("Input value B: ");
        int B = sc.nextInt();
        int kol = B-1;
        for (int i = A; i <= B; i++) {
            kol++;
            for (int j = kol; j >= B; j--) System.out.println(i);
        }
    }
}

