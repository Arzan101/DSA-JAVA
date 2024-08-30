package recurssion;

public class mobilekeypad {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int i, String combination) {
        if (i == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(i);
        String mapping = keypad[currentChar - '0'];

        for (i = 0; i < mapping.length(); i++) {
            printComb(str, i + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}
