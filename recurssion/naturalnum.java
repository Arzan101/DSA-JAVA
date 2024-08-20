package recurssion;

public class naturalnum {

    public static void reccur(int n, int i, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        reccur(n, i + 1, sum + i);
        System.out.println(sum);

    }

    public static void main(String args[]) {

        reccur(5, 1, 0);

    }
}
