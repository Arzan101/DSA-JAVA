
public class Pattern3 {

    static int m = 4;

    public static void main(String[] args) {
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
