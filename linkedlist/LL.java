package linkedlist;

import java.util.LinkedList;

public class LL {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("this");
        list.addFirst("hello");

        System.out.print(list);

        list.addLast("is");
        list.addLast("list");
        System.out.print(list);

        for (int i = 0; i < list.size(); i++) {

            System.out.print("->" + list.get(i));
        }

    }
}
