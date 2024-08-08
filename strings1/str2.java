package strings1;

import java.util.Scanner;

public class str2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter first String :");
        String str1 = sc.nextLine();
        System.out.println("Enter second String :");
        String str2 = sc.nextLine();
        String str = str1 + str2;
        System.out.println(str);
        System.out.println(str.length());
    }
}
