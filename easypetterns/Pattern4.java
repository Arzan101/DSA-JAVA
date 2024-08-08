
public class Pattern4 {

    static int n = 4;

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { //for rows
            for (int j = 1; j <= n - i; j++) { //printing space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
