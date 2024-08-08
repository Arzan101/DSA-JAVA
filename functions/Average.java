package functions;

import java.util.Scanner;

public class Average {

    public static void Avg(int i, int j, int n) {
        double average = (i + j + n) / 3.0;
        System.out.println("Average is: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int j = sc.nextInt();

        Avg(i, j, n);
    }

}
