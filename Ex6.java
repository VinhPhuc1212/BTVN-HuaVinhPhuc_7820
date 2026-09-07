
package LEC_07_STRING;

import java.util.*;

public class Ex6 {
    public static String reverse(String text){
        return new StringBuilder(text).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
            String original = scanner.nextLine();
            System.out.println("Enter a string: ");
            System.out.println("Orininal: " + original);
            System.out.println("Reversed :"+ reverse(original));
    }
}
