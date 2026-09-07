package LEC_07_STRING;

import java.util.*;

public class Basicstring {

    private static String trimText(String text) {
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line");
        String text = scanner.nextLine();
        String trimmed = trimText(text);
        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Lower: "  + text.toUpperCase());
        System.out.println("Original length + " + text.length ());
        System.out.println("length after trim = "  + trimmed.length());

        }
}
