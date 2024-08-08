package arrays;

import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] number = new int[row][col];

        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element u want to find :");
        int target = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == target) {
                    System.out.println("Element found at position : (" + i + "," + j + ")");
                    return;
                }
            }
        }
    }
}
