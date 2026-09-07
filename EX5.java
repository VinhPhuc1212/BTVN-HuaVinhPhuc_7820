package LEC_07_STRING;

import java.util.*;

public class EX5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = scanner.nextLine();
        
        System.out.println("Start with report: " + file.startsWith("report"));
        System.out.println("End with .pdf: " + file.endsWith(".pdf"));
        System.out.println("First character: " + file.charAt(0));
        System.out.println("Last character: " + file.charAt(file.length() - 1));
        
        scanner.close();
    }
}