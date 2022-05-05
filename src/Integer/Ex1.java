package Integer;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Vvedite a i b: ");
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int qm = L / 100;
        System.out.println(qm);
    }

}