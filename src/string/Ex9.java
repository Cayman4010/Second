package string;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value N: ");
        int n = sc.nextInt();
        char[] ch = new char[n];
        String str;

        char c1 = '$';
        char c2 = '*';

        for (int i = 0; i < n; i++) {
            if (i%2==0) ch[i] = c1;
            if (i%2!=0) ch[i] = c2;
        }
        str = new String(ch);

        System.out.println(str);
    }
}
