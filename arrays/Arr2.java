package arrays;

import java.util.*;

public class Arr2 {

    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { // Fixed to i < arr.length
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) { // Removed the trailing comma
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter array elements:");
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int maxValue = max(number); // Changed arr to number
        System.out.println("Maximum value in the array: " + maxValue);
    }
}
