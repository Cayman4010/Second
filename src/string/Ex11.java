package string;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String s = sc.nextLine();
        System.out.print("String with spaces: ");
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1) System.out.print(s.charAt(i) + " ");
            if (i == s.length()-1) System.out.print(s.charAt(i));
        }
    }
}
