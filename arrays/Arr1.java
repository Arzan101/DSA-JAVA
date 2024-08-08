package arrays;

public class Arr1 {

    public static void main(String[] args) {
        //type 1 to declare array
        // int[] number = new int[4];
        // number[0] = 11;
        // number[1] = 12;
        // number[2] = 13;
        // number[3] = 14;

        //type 2 to declare and initialize array
        int[] number = {11, 12, 13, 14};

        //in string format 
        //System.out.println("Original Array: " + java.util.Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

}
