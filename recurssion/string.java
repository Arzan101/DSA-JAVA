package recurssion;

public class string {

    public static void reverse(String s, int i) {
        if (i == 0) {
            System.out.print(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s, i - 1);

    }

    public static void main(String[] args) {
        String str = "Hello";
        reverse(str, str.length() - 1);
    }
}
