package string;
import java.util.Scanner;
public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string S: ");
        String s = sc.nextLine();
        int a1 = -1;
        int a2 = s.indexOf(' '), sum = 0, quanSpace = 0, stop = 0;
        int l = s.length();
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i) == ' ') quanSpace++;
        }
        for (int i = 0; i < l; i++) {
            a2 = s.indexOf(' ', a1+1);  stop++;
            if (s.charAt(a1+1)==s.charAt(a2-1) && s.charAt(a1+1)!=' ') sum++;
            if(stop==quanSpace) break;
            a1=a2; a2=s.indexOf(' ', a1+1);
        }
        if(s.charAt(a2+1)==s.charAt(l-1) && s.charAt(l-1)!=' ') sum++;
        System.out.println("Quantity words with first such last letter: " + sum);
    }
}
