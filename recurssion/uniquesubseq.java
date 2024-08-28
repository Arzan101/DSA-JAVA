package recurssion;

public class uniquesubseq {

    public static void uniquesubseq(String str, int i, String newString) {
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(i);
        uniquesubseq(str, i + 1, newString + currentChar);
        uniquesubseq(str, i + 1, newString);
    }

    public static void main(String[] args) {

        String str = "abbcdcgg";
        uniquesubseq(str, 0, "");
    }
}
