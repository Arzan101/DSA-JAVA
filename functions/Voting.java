package functions;

import java.util.Scanner;

public class Voting {

    public static boolean Age(int v) {
        if (v >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your age:");
        int v = sc.nextInt();
        System.out.println(Age(v));
        Age(v);
        sc.close();

    }
}
