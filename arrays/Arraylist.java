package arrays;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(1, 1);

        System.out.println(list);

        list.set(0, 5);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        Collections.sort(list);
        System.out.println("\nSorted list: " + list);

    }
}
