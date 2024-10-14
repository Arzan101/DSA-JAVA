package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Greaterthan25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // Ask the user how many numbers they want to input
        System.out.println("How many numbers do you want to add to the LinkedList? (Range: 1-50):");
        int n = sc.nextInt();

        // Taking inputs for LinkedList
        System.out.println("Enter " + n + " numbers between 1 and 50:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            // Ensure the number is within the range 1-50
            if (num >= 1 && num <= 50) {
                list.add(num);
            } else {
                System.out.println("Number out of range! Please enter a number between 1 and 50.");
                i--; // Decrement i to allow another attempt for this iteration
            }
        }

        // Print the list before removal
        System.out.println("Original list: " + list);

        // Remove nodes with values greater than 25
        list.removeIf((num) -> num > 25);

        // Print the remaining elements in the list
        System.out.println("List after removing numbers greater than 25: " + list);
    }
}
