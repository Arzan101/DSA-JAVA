package recurssion;

public class removeDuplicate {

    public static boolean[] present = new boolean[26];

    public static void removeDuplicate(int i, String newString, String str) {
        if (i == str.length()) {
            System.out.println();
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(i);
        if (present[currentChar - 'a']) {
            removeDuplicate(i + 1, newString, str);
        } else {
            newString += currentChar;
            present[currentChar - 'a'] = true;
            removeDuplicate(i + 1, newString, str);
        }

    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(0, "", str);
    }
}
