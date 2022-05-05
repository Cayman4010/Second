package string;
import java.util.Scanner;
public class Ex23_dodelat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any string: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int [] integer = new int [s.length()];
        for(int i = 0; i <= integer.length; i++) {
            integer[i] = chars[i];
        }



    }
}
