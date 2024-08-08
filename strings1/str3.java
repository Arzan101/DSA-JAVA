package strings1;

import java.util.Scanner;

public class str3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        String userName = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            userName += email.charAt(i);
        }
        System.out.println("User name: " + userName);
    }
}
