package string;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String s = sc.nextLine();
        int realnumber = 0;
        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57 && s.charAt(i) != 46) integer++;
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57 || s.charAt(i) == 46) realnumber++;
        }
        if (realnumber == s.length() && integer != s.length() && s.charAt(0) != 46 && s.charAt(s.length()-1) != 46)
           System.out.println("The string is real number");
        else if (integer == s.length()) System.out.println("The string is integer");
        else System.out.println("The string is not integer or real number");

    }
}
