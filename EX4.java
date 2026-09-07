package LEC_07_STRING;

import java.util.*;

public class EX4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class ID : ");
        String ID = scanner.nextLine();
        System.out.println("Major code : " + ID.substring(0, 2));
        System.out.println("Numberic part: " + ID.substring(0, 8));
    }
}
