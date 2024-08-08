import java.util.*;

public class Hello {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
        //     if (a % 2 == 0) {
        //         System.out.println("even number");
                
        //     } else {
        //         System.out.println("odd number");
        //     }
            
        //     // Close the scanner

        switch (button) {
            case 1: System.out.println("hello");
                
                break;
            case 2: System.out.println("namste");
            break;

            case 3: System.out.println("kasakai");
            break;
            default:
                throw new AssertionError();
        }
        }
    }
}
