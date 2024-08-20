package recurssion;

public class fibonnaci {

    public static void fibo(int a, int b, int n) {
        if (n <= 1) {
            System.out.print(n + " ");
            return;
        }

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibo(0, 1, n - 2);

    }
}
