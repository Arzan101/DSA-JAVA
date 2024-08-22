package strings1;

import java.util.Arrays;
import java.util.Scanner;

public class assendingarray {

    public static boolean Assen(int Arr[], int i) {

        if (i == Arr.length - 1) {
            return true;
        }
        if (Arr[i] >= Arr[i + 1]) {
            return false;

        } else {
            return Assen(Arr, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        System.out.println("Enter Elements of array :");
        int Arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Arr));
        System.out.println(Assen(Arr, 0));

    }
}
