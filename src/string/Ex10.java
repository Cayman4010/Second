package string;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String str = sc.nextLine();
        System.out.print("String backwards: ");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
