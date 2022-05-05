package For;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(K);
        }

    }
}
