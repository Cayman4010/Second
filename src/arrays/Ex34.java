//package arrays;
//
//import java.util.Scanner;
//
//public class Ex34 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input value of N: ");
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        System.out.print("Input value of elements of array A: ");
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//        int max;
//        for (int i = 1; i < N - 1; i++) {
//            if (A[i] < A[i - 1] && A[i] < A[i + 1]) {
//                max = A[i];
//                break;
//            }
//        }
//        if (sum == 1) {
//            for (int i = 1; i < N - 1; i++) {
//                if (A[i] < A[i - 1] && A[i] < A[i + 1] && A[i] > max) {
//                    max = A[i];
//                }
//            }
//        } else {
//            System.out.println("Maximal Local minimum not found");
//
//        }
//    }
//}

