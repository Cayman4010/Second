package Proc;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = sc.nextFloat();
        System.out.print("Input b: ");
        float b = sc.nextFloat();
        System.out.println(sign(a) + sign(b));
    }
    public static int sign (float x) {
        if (x < 0) x = -1;
        if (x == 0) x = 0;
        if (x > 0) x = 1;
        return (int)x;
    }

}
