package recurssion;

public class subsequence {

    public static void subsequence(String str1, int i, String newString) {

        if (i == str1.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str1.charAt(i);
        subsequence(str1, i + 1, newString + currentChar);

        subsequence(str1, i + 1, newString);

    }

    public static void main(String[] args) {
        String str1 = "abc";
        subsequence(str1, 0, "");
    }
}
