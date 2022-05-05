package For; // 1, 2, 3, 4, 6, 7, 10, 12, 13, 16, 17, 19, 33
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        System.out.print("Price for 1 kg of candies: ");
        Scanner xerox = new Scanner(System.in);
        double price = xerox.nextDouble();
        for (double i = 1.2; i <= 2; i += 0.2) {
            System.out.println(i * price);
        }

    }
}
