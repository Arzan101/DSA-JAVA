package recurssion;

public class Occurrence {

    public static void occur(String str, int i, char element) {

        if (i == str.length()) {
            return;
        }
        if (str.charAt(i) == element) {
            System.out.println("Element found at index: " + i);
        }
        occur(str, i + 1, element);

    }

    public static void main(String[] args) {
        String str = "aabbbccadd";
        occur(str, 0, 'a');
    }
}
