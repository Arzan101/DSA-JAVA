package recurssion;

public class matrix {

    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downward = countpath(i + 1, j, n, m);

        int rightward = countpath(i, j + 1, n, m);

        return downward + rightward;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int totalPath = countpath(0, 0, n, m);
        System.out.println("Total number of paths = " + totalPath);
    }
}
