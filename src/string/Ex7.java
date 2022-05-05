package string;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String str = sc.nextLine();
        System.out.println("First symbol of string: " + str.charAt(0));
        System.out.println("Last symbol of string: " + str.charAt(str.length() - 1));
    }
}
