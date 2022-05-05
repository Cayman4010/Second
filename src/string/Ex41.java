package string;
import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string S: ");
        String s = sc.nextLine();
        int sum = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') sum++;
        }
        System.out.println("Quantity of words = "+sum);
    }
}
