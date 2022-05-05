package For;
import java.util.Scanner;
public class Ex12 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        int N = sc.nextInt();
        double proiz = 1;
        for (double i = 1; i <= N; i++) {
            proiz = proiz * (1+i/10);
        }
        System.out.println(proiz);
    }

}
