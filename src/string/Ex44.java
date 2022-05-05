package string;
import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string S: ");
        String s = sc.nextLine();
        int a1 = -1;
        int a2 = s.indexOf(' '), sumWord = 0, sumA=0, quanSpace = 0, stop = 0;
        int l = s.length();
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i) == ' ') quanSpace++;
        }
        for (int i = 0; i < l; i++) {
            a2 = s.indexOf(' ', a1+1);  stop++;
            for (int j = a1+1; j < a2; j++){
                if(s.charAt(j) == 'A') sumA++;
            }
            if (sumA == 3) sumWord++;
            if(stop==quanSpace) break;
            a1=a2; a2=s.indexOf(' ', a1+1);
        }
        int sumA2=0;
        for (int i = 0; i < 1; i++) {
            for (int j = a2 + 1; j < l; j++) {
                if (s.charAt(j) == 'A') sumA2++;
            }
            if (sumA2 == 3) sumWord++;
        }
        System.out.println("Quantity words with 3 letter A: " + sumWord);
    }
}
