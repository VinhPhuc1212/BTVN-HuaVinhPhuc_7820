
package LEC_07_STRING;
import java.util.*;
public class Ex7 {
    public static int count (String text, char target){
        int count = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == target){
                count++;
            }
        }
    return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Enter character to count:");
        char target = scanner.next().charAt(0);
        System.out.println("Occurrences of '" + target +"':"+count(text,target));
        
    }
}