package strings1;

public class str1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'T');
        System.out.println(sb);

        sb.insert(5, 'x');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
