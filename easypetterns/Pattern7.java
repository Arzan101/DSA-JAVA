
public class Pattern7 {

    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++);
            }
            System.out.println("");
        }
    }

}
