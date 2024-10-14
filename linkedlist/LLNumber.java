package linkedlist;

import java.util.LinkedList;

public class LLNumber {

    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<Number>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(7);
        System.out.print(list);

        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i).equals(7)) {
        //         System.out.println("index is" + " " + i);
        //     }
        // }
        // another approach The indexOf(7) method is used to search for the first occurrence of the number 7.
        // It returns the index if found, or -1 if the element isn't present.
        int index = list.indexOf(7);

        if (index != -1) {
            System.out.println("Number found at " + index);
        } else {
            System.out.println("not present");
        }
    }

}
