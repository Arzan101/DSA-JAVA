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

    }
}
