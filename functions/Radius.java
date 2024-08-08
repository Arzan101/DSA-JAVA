package functions;

import java.util.Scanner;

public class Radius {

    public static int calcArea(int r) {
        int circumference = (int) (2 * 3.14 * r);
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter the radius of circle:");
        int r = sc.nextInt();
        System.out.println("circumference of circle is: " + calcArea(r));

        calcArea(r);

    }
}
