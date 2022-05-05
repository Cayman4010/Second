package If;

import java.util.Scanner;

public class Exif5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int par = 0;
        int nepar = 0;
        if (a1 > 0) {
            par = par + 1;
        } else {nepar = nepar + 1;}
        if (a2 > 0) {
            par = par + 1;
        } else {nepar = nepar + 1;}
        if (a3 > 0) {
            par = par + 1;
        } else {nepar = nepar + 1;}
        System.out.println(par);
        System.out.println(nepar);

    }
}

