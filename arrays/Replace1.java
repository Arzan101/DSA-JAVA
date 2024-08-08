package arrays;

import java.util.Scanner;

public class Replace1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter string :");
        String str = sc.nextLine();

        System.out.println("Original : " + " " + str);
        System.out.println("result : " + " " + str.replace('e', 'i'));
    }
}

//without replace method hard 
// import java.util.*;
// public class Strings {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      String str = sc.next();
//      String result = "";
//      for(int i=0; i<str.length(); i++) {
//        if(str.charAt(i) == 'e') {
//          result += 'i';
//        } else {
//          result += str.charAt(i);
//        }
//      }
//      System.out.println(result);
//    }
}
