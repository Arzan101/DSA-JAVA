package recurssion;

public class fact {

    public static int factorial(int n) {
        if (n == 1 || n == 0) {

            return 1;
        }
        int sequence = factorial(n - 1);
        int fact1 = n * sequence;
        return fact1;
    }

    public static void main(String[] args) {

        int ans = factorial(5);
        System.out.println(ans);
    }
}
