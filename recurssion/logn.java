package recurssion;

public class logn {

    public static int calclog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int store1 = calclog(x, n / 2);
            int logn1 = store1 * calclog(x, n / 2);
            System.out.println(logn1);
            return logn1;

        } else {
            int store1 = calclog(x, n / 2);

            int logn1 = x * store1 * calclog(x, n / 2);
            System.out.println(logn1);
            return logn1;

        }

    }

    public static void main(String[] args) {

        calclog(2, 5);

    }

}
