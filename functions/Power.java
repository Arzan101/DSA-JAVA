package functions;

import java.util.Scanner;

public class Power {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) Math.pow(x, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the base number :");
        int x = sc.nextInt();
        System.out.println("Enter the power number :");
        int n = sc.nextInt();
        int result = power(x, n);

        System.out.println("Result is " + result);
    }
}
