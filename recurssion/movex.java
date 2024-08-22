package recurssion;

public class movex {

    public static void movex(String str, int i, int count, String newString) {

        if (i == str.length()) {
            for (i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println();
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(i);
        if (currentChar == 'x') {
            count++;
            movex(str, i + 1, count, newString);
        } else {
            newString += currentChar;
            movex(str, i + 1, count, newString);
        }

    }

    public static void main(String[] args) {
        String str = "axbxxd";
        movex(str, 0, 0, "");

    }
}
