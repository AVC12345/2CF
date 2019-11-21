import java.util.*;

/**
 * _2CF_Tester
 */
public class _2CF_Tester {

    public static void main(String[] args) {
        
        System.out.print("Enter a binary number: ");
        Scanner input = new Scanner(System.in);
        String a;
        a = input.nextLine();

        /**
         * 
         * for(char c : a) {
            System.out.println(c);
        } 
        */

        _2CF binaryNumber = new _2CF(a);

        
        System.out.println(binaryNumber);


    }
}