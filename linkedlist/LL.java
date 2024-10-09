package linkedlist;

import java.util.LinkedList;

public class LL {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("hello");
        System.out.print(list);

        list.addLast("list");
        System.out.print(list);

    }
}
