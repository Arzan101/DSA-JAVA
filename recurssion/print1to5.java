package recurssion;

public class print1to5 {

    public static void reccur(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        reccur(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        reccur(n);
    }
}
