package recurssion;

import java.util.HashSet;

public class uniquesubseq {

    public static void uniquesubseq(String str, int i, String newString, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char currentChar = str.charAt(i);
        uniquesubseq(str, i + 1, newString + currentChar, set);
        uniquesubseq(str, i + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<String>();
        uniquesubseq(str, 0, "", set);
    }
}
