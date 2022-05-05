package string;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String s = sc.nextLine(), strN;
        System.out.print("Input value N: ");
        int n = sc.nextInt();
        char[] chars = new char[n];
        if (s.length() >= n) {
            for (int i = 0; i < n; i++) chars[i] = s.charAt(i + (s.length() - n));
        } else if (s.length() < n) {
            for (int i = 0; i < n - s.length(); i++) chars[i] = 46;
            for (int i = n - s.length(); i < n; i++) chars[i] = s.charAt(i - (n - s.length()));
        }
        strN = new String(chars);
        System.out.println(strN);
    }
}
